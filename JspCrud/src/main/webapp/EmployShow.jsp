<%@page import="com.dxc.jsp.ConnectionHelper"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
<table border="3">
	<tr>
		<th>Empno</th>
		<th>Name</th>
		<th>Dept</th>
		<th>Desig</th>
		<th>Basic</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	<%
		Connection con=ConnectionHelper.getConnection();
		String cmd="select * from Employ";
		PreparedStatement pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
	%>
		<tr>
			<td> <%=rs.getInt("empno") %> </td>
			<td> <%=rs.getString("name") %> </td>
			<td> <%=rs.getString("dept") %> </td>
			<td> <%=rs.getString("desig") %> </td>
			<td> <%=rs.getInt("basic") %> </td>
			<td><a href="UpdateEmploy.jsp?empno=<%=rs.getInt("empno")%>">Update</a></td>
			<td><a href="DeleteEmploy.jsp?empno=<%=rs.getInt("empno")%>">Delete</a> </td>
		</tr>
	<%
		}
	%>
</table> <br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="AddEmploy.jsp">Add Employ</a>
</body>
</html>