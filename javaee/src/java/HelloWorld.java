
import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {
    
    private String message;
    
    public void init()throws ServletException{ //step 1
        //Do required initialization
        message = "Hello ";
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    { //step 2
        //Set response content type
        response.setContentType("text/html");
        //Actual logic goes here
        PrintWriter out = response.getWriter();
        String name = request.getParameter("nama"); //step 4 -- cara untuk pass parameter to another page
        out.println("<h1>" + this.message + name + "</h1>"); // akan baca Hello dan nama yang dikey in as HelloWorld?nama=Saiful <di URL>
            
    }
    
    
    //step 5
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    { 
        //semua data di treat sebagai String
        String nama = request.getParameter("nama"); // string nama - relate with form.html
        int umur = Integer.parseInt(request.getParameter("umur")); // int umur - relate with form.html
        PrintWriter out = response.getWriter();
        out.println("<h1>" + nama + "" + umur + "</h1>");
            
    }
}
