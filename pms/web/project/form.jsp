
<%@page import="models.ProjectModel"%>
<!-- step 4 selepas buat untuk fail controllers/list.jsp  -->
<%@include file="../include/header.jsp" %>
<%
  ProjectModel pro =(ProjectModel) request.getAttribute("project");  
%>
<legend> Daftar Projek </legend>
<form method="post" action="/pms/project" > <!-- project akan dipass ke Controllers/Project.java  -->
    <div class="row"> 
        <div class="col-md-1">Tajuk</div>
        <div class="col-md-4"><input value="<%= pro.getTitle()%>" class="form-control" type="text" name="title"></div>           
    </div>
    <br>
    <div class="row">
        <div class="col-md-1">Keterangan</div>
        <div class="col-md-4"><textarea class="form-control" name="description"> <%= pro.getDescription()%></textarea></div> 
    </div>
    <br>
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-4"><input class="btn btn-primary" type="submit" value="Simpan"></div>  
    </div>
    
</form>
<%@include file="../include/footer.jsp" %>