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
        <td>Tindakan</td>
    </tr>
    <%
        ArrayList list = (ArrayList)request.getAttribute("list");
        for (int i=0; i<list.size(); i++){
            ProjectModel pro = (ProjectModel)list.get(i);
    %>
    <tr>
        <!-- encapsulation - sbb error - xbleh access directly sebb title adalah private dari ProjectModel-->
        <!-- kena guna getter and setter di ProjectModel.java-->
        <td><%= i + 1%></td> 
        <td><%= pro.getTitle() %></td> 
        <td><%= pro.getDescription() %></td> 
        <td>
            <a href="/pms/project?id=<%= pro.getId() %>&action=edit" class="btn btn-success btn-sm">Edit</a>
            <a href="/pms/project?id=<%= pro.getId() %>&action=del"  class="btn btn-danger btn-sm">Delete</a>
        </td>
 
    </tr>
     <% } %>
</table>
     
<%@include file="../include/footer.jsp" %>