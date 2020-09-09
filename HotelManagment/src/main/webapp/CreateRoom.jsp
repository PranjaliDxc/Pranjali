<%@page import="com.dxc.hotel.RoomCrud"%>
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
<jsp:useBean id ="bean1"  class= "com.dxc.hotel.Room"/>
<jsp:setProperty property = "*"  name = "bean1"/>
<% 
 Room object = new Room();
 object.setType(bean1.getType());
 object.setCostperday(bean1.getCostperday());
 object.setStatus(bean1.getStatus());
 
 RoomCrud room =new RoomCrud();
 
 out.println(room.generateRoomId());
 
 out.println(room.addRoom(object));
  %>
 
</body>
</html>