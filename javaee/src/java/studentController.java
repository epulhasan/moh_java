
import model.StudentModel; //bila ada dalam package yang berbeza, kita kena import untuk guna another model
import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/student"})
public class studentController extends HttpServlet {
    //http://localhost:9999/javaee/student?id=1
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    { 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int studId = Integer.parseInt(request.getParameter("id")); // convert ke interger
        StudentModel stud = new StudentModel().getOne(studId);  //akan returnkan satu projek student
        request.setAttribute("stud", stud); //forward to JSP
        RequestDispatcher dispatch = request.getRequestDispatcher("student_details.jsp");
        dispatch.forward(request, response);
    }
    
}
