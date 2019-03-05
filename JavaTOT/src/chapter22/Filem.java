
package chapter22; //step 1
//import ini datang daripada JDK yang dah dibuild in
import com.mysql.cj.xdevapi.Statement; // step 6 akan terhasil bila klik warning daripada step 5
import java.sql.Connection; //terhasil daripada step 8
import java.sql.DriverManager; // step 6 akan terhasil bila klik warning daripada step 5
import java.sql.ResultSet; // step 6 akan terhasil bila klik warning daripada step 5


public class Filem { //step 1
 
    protected void list(){ // step 3- protected hanya untuk diakses oleh class yang sama
        Connection con = null; //step 5 - akan ada error untuk ketiga-tiga property tersebut cuma klik yang bhgian tepi
        Statement stmt = null; //akan import direct sperti di step 6
        ResultSet rs = null;

       // list all film title and desc
       // try..catch untuk exception handling/error handling
       // code berada dalam try, catch bila berlaku error
       try{ // step 7
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York","root",""); //step 8 - localhost tgok port di SqlYog - biasanya 3306 dan 3307
           
       }catch(Exception e){ //step 9
           System.out.println("Berlaku Error");//step  10
           System.out.println(e.getMessage()); 
           
       }
    }
    
    public static void main(String[] args){ //step 2
        Filem f = new Filem(); //step 4 - f adalah object bagi filem 
        f.list(); // dalam object f ada class list
    }
    
}
