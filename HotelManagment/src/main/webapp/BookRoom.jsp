<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.Date"%>


<%@page import="java.util.List"%>
<%@page import="com.dxc.hotel.RoomCrud"%>
<%@page import="com.dxc.hotel.Booking"%>
<%@page import="com.dxc.hotel.Room"%>
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
RoomCrud ob = new RoomCrud();
String bookid = ob.generateBookId();

%>
<form  method = "get" action ="BookRoom.jsp" >

<center>
<table>


Booking Id :
<input type="text" name ="bookid"  readonly ="readonly"   value= "<%=bookid %>" /> <br/><br/>
 		
 			Room id : 
		<select name="roomid">
			<option value="please Select">Please Select Room</option>

 <%
	List<String> lst =new RoomCrud().available();
		for(String str : lst){
		%>
		<option value="<%=str%>"> <%=str%> </option>
		<% 
		}
		%>
		
		</select><br><br>
			CustomerName:
			<input type="text" name="custname"><br/><br/>
			City:
		<input type="text" name="city"><br/><br/>
			Book Date : 
			<input type="date" name="bookdate" /> <br/><br/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="BookRoom" />
 </select>
</center>
</form>

<jsp:useBean id="book" class="com.dxc.hotel.Booking"/>
<jsp:setProperty property="custname"  name="book"/>
<jsp:setProperty property="city"  name="book"/>
<jsp:setProperty property="bookiid"  name="book"/>

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
</table>
</body>
</html>