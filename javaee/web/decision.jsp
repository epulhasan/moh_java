<%-- 
    Document   : Decision-Making Statements
    Created on : Mar 6, 2019, 3:24:53 PM
    Author     : epulhasan
--%>

<%! 
    int day = 7;
%>

<% if (day == 1 | day == 7) { %>
    <p>Today is weekend </p>
<% } else { %>
     <p>Today is not weekend </p>
<% } %>
