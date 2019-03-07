<!-- step 3 selepas buat untuk fail controllers/Project.java  -->

<%@page import="controllers.Project"%>
<%@page import="java.util.ArrayList"%>
<%@page import="models.ProjectModel"%>
<%@include file="../include/header.jsp" %>

<table class="table table-bordered"> 
    <tr>
        <td>Bil</td>
        <td>Tajuk</td>
        <td>Keterangan</td>
    </tr>
    <%
        ArrayList list = (ArrayList)request.getAttribute("list");
        for (int i=0; i<list.size(); i++){
            ProjectModel pro = (ProjectModel)list.get(i);
    %>
    <tr>
        <td></td>
        <!-- encapsulation - sbb error - xbleh access directly sebb title adalah private dari ProjectModel-->
        <!-- kena guna getter and setter di ProjectModel.java-->
        <td><%= pro.getTitle() %></td> 
        <td></td>
    </tr>
     <% } %>
</table>
     
<%@include file="../include/footer.jsp" %>