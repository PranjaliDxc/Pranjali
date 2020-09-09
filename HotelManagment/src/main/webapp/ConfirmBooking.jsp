<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="book" class="com.dxc.hotel.Booking"/>
<jsp:setProperty property="custname"  name="book"/>
<jsp:setProperty property="city"  name="book"/>
<%

if(request.getParameter("city")!= null){
	String date = request.getParameter("bookdate");
	book.setBookiid(bookid);
	Date sd = new Date();
	long time = sd.getTime();
	Timestamp ts = new Timestamp(time);
	 
	book.setBookdate(ts);				
	%>
	<%=new RoomCrud().addBooking(book) %>
	<%
	             }
	%>
</body>
</html>