<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User JSP</title>
</head>
<body>
<% 
   String fn=request.getParameter("fname");
   String ln=request.getParameter("lname");
   String ll=request.getParameter("fname");
%>
<h1>輸入的姓名:<%=fn%> ,<%=ln%> </h1>
</body>
</html>