
package chapter22; //step 1

import com.mysql.cj.xdevapi.Statement; // step 6 akan terhasil bila klik warning daripada step 5
import java.sql.Connection;
import java.sql.ResultSet;


public class Filem { //step 1
    Connection con = null; //step 5 - akan ada error untuk ketiga-tiga property tersebut cuma klik yang bhgian tepi
    Statement stmt = null; //akan import direct sperti di step 6
    ResultSet rs = null;
    
    protected void list(){ // step 3- protected hanya untuk diakses oleh class yang sama
       // list all film title and desc
    }
    
    public static void main(String[] args){ //step 2
        Filem f = new Filem(); //step 4 - f adalah object filem 
        f.list(); // dalam object f ada class list
    }
    
}
