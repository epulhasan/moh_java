<%-- 
    Document   : student_details
    Created on : Mar 6, 2019, 3:46:05 PM
    Author     : Pengguna  PC 02
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.StudentModel"%>  <!-- kena import-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        StudentModel stud = (StudentModel) request.getAttribute("stud");
        out.print("Nama Student: " + stud.name);
        out.print("<br>");
        out.print("Student ID: " + stud.id);
        %>
        <h1>Student Details</h1>
        Name : 
        <br>
        ID : 
    </body>
</html>
