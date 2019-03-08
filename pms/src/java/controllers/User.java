//step 2 - daftar pengguna
package controllers;

//step 1
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.UserModel;

@WebServlet(name = "User", urlPatterns = {"/user"})
public class User extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    //step 2
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //data ni semua baca daripada form
        String name = request.getParameter("name");
        String role = request.getParameter("role");
        String pwd = request.getParameter("pwd");
        String gender = request.getParameter("gender");
        UserModel user = new UserModel();
        //kena buat set ke dalam object selepas baca  data daripada form - baru masuk database
        user.setGender(gender);
        user.setName(name);
        user.setPwd(pwd);
        user.setRole(role);
        user.insert();
    }

    
}
