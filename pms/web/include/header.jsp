<!-- 2 tempat untuk check session -->
<!-- tempat pertama: check session -->
<% 
   if(session.getAttribute("loggedin") == null) {
       response.sendRedirect("/pms/pub/login.jsp");
   }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/pms/assets/bootstrap/css/bootstrap.css">
        <title>PMS</title>
    </head>
    <body>
        <h1>Hello World!</h1>

