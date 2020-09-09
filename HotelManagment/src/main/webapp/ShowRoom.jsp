<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.dxc.hotel.RoomCrud"%>
    <%@page import="com.dxc.hotel.Room"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		List<Room> rlist = new RoomCrud().showRoom();
	%><center>
	
	Room Record:- 
	</br></br>
	<table border="3">
		<tr>
		<th>Room id</th>
			<th>Type</th>
			<th>Status</th>
			<th>Cost Per Day</th>
			</tr>
			
	
		<%
			for(Room r : rlist) {
		%>
		<tr>
			<td> <%=r.getRoomid() %> </td>
			<td> <%=r.getType() %> </td>
	
			<%  
	if(r.getStatus().equals("Available")){
		%>
		<td bgcolor ="green"><%=r.getStatus() %></td>
		<%} else {
			%>
	<td><%= r.getStatus()%>  </td>
	<%
		}	
	%>
	
		
			<td> <%=r.getCostperday() %> </td>
	
			
		<%
			}
		%>
	</table>
	</center>
</body>
</html>