<%@ page language="java" import="Quiz.*" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Login</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/styles.css">
<style type="text/css">
body {
	background:
		url("${pageContext.request.contextPath}/images/background.jpg");
}
</style>
</head>
<body>

	<div id='cssmenu'>
		<ul>
			<li class=''><a href='${pageContext.request.contextPath}'><span>Home</span></a></li>
			<li><a href='${pageContext.request.contextPath}/login'><span>Login</span></a></li>
			<li><a href='${pageContext.request.contextPath}/register'><span>Register</span></a></li>
			<li><a href='${pageContext.request.contextPath}/feedback'><span>Feedback</span></a></li>
		</ul>
	</div>

	<div id="wrapper">

		<form name="login-form" class="login-form" action="checkLogin"
			method="post">

			<div class="header">
				<%
				Object s = request.getAttribute("errorMessage");
				if (s != null) {
				%>
				<font size="2" color="red">*<%=(String) s%></font>
				<%
				}
				%>
				<h1>Login</h1>
				<span></span>
			</div>

			<div class="content">
				<input name="username" type="text" class="input username"
					placeholder="Username" /> <input name="password" type="password"
					class="input password" placeholder="Password" />
			</div>

			<div class="footer">
				<input type="submit" name="submit" value="Login" class="button" />
				<div>
					Don`t have an account? click here to <a
						href='${pageContext.request.contextPath}/register.jsp'>Register</a>
				</div>

			</div>

		</form>

	</div>


</body>
</html>