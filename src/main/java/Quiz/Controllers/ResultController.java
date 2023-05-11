package Quiz.Controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Quiz.*;
/**
 * Servlet implementation class ResultController
 */
@WebServlet("/result")
public class ResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("id");
		String username = (String) session.getAttribute("user");
		String examType = (String) session.getAttribute("exam");
		String noOfQue = "10";
		int correctAns = (int) session.getAttribute("result");
		String corAns = Integer.toString(correctAns);
		String started = (String) session.getAttribute("started");
		String status;
		if((int)session.getAttribute("result") >= 5) {
			status = "Passed";
		}else {
			status = "Failed";
		}
		
		ResultModel result = new ResultModel(userId, username, examType, noOfQue, corAns, status, started);
		
		Connection con = dbManager.createConnection();
		
		try {
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO results(userid, username, exam, noOfQue, corAns, status, started) values(?,?,?,?,?,?,?)");
			
			ps.setString(1, userId);
			ps.setString(2, username);			
			ps.setString(3, examType);
			ps.setString(4, noOfQue);
			ps.setString(5, corAns);
			ps.setString(6, status);
			ps.setString(7, started);
			
			ps.executeUpdate();
		}catch (SQLException sqe) {
			System.out.println("Error : While Inserting record in database");
			request.setAttribute("err", sqe.getMessage());
		}
		try {
			con.close();
		} catch (SQLException se) {
			System.out.println("Error : While Closing Connection");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
		dispatcher.forward(request, response);
	}

}
