<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.dxc.jsp.ConnectionHelper"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		Connection con=ConnectionHelper.getConnection();
		int empno=Integer.parseInt(request.getParameter("empno"));
		String cmd="delete from Employ where Empno=?";
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, empno);
		pst.executeUpdate();
	%>
	<jsp:forward page="EmployShow.jsp" />
</body>
</html>