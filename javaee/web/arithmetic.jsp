<%-- 
    Document   : arithmetic
    Created on : Mar 6, 2019, 2:52:24 PM
    Author     : epulhasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Expression Language</h1>
          2 + 2 = ${2 + 2} 
        <hr>
        <h1> Scriplet </h1>
         <% String name = "Saiful Bahari"; 
            out.println(name);
            
            out.println(cetak(5)); 
         %>
         <hr>
         <h1> Declarations -output:  0--1--2--3--4--  </h1>
         <%! 
            public String cetak(int bil){
            String str = "";
                for(int i=0; i<bil; i++){
                   str += i + "--";
               }
               return str;
            } 
         %>
         <hr>
         <h1> JSP Expression - execute dalam satu lain, ie: print sesuatu</h1>
         Tarikh hari ini ialah <%= new java.util.Date() %> 
         <hr>
         <h1>JSP Directive</h1>
         <%@include file="Form.html" %>
             
    </body>
</html>
