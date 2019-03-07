package model;

//Buat ini dahulu barulah studentModel.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Model {
    public Statement getStmt(){
        Connection con = null;
        Statement stmt = null;
        
         try{
           Class.forName("com.mysql.jdbc.Driver"); //mesti kena ada driver ini juga untuk connect ke database 
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York","root",""); 
           stmt = con.createStatement();
        }catch (Exception e) {
            System.out.println("Masalah Teknikal");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return stmt;
        
    }
}
