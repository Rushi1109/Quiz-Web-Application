package Quiz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbManager {
	
	private static String dbURL="jdbc:mysql://localhost:3306/userdb";
	private static String dbUser="root";
	private static String dbPassword="mysql";
	
	public static Connection createConnection()
	{
		 Connection con=null;
		try{
			try {
				   Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch(ClassNotFoundException ex) {
				   System.out.println("Error: unable to load driver class!");
				   System.exit(1);
				}			
		     con = DriverManager.getConnection(dbURL,dbUser,dbPassword);
		   }
		  catch(SQLException sqe){ System.out.println("Error: While Creating connection to database");sqe.printStackTrace();}
		return con;
	}

}


