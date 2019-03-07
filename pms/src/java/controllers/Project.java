//step 2 - fail Project.java daripada Controllers - Buat selepas ProjectModel.java daripada Models 
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList; //step 3
import static java.util.Collections.list; //step 6
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ProjectModel; //step 4

@WebServlet(name = "Project", urlPatterns = {"/project"}) //automatik dari create servlet
public class Project extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //step 1 - pastikan ada doGet sahaja
       // ArrayList arr = new models.ProjectModel().getAll(); // guna cara ini jika tak import models.ProjectModel
        ArrayList list = new ProjectModel().getAll();//step 2 - create object class ProjectModel dan getAll
   
        request.setAttribute("list", list); //step 5
        request.getRequestDispatcher("project/list.jsp").forward(request, response); //untuk papar di jsp
    }

}
