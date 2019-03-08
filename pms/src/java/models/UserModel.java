//step 2 - buat signin form
package models;

import java.sql.ResultSet;
import java.sql.Statement;


public class UserModel extends Model{ //step 1 - inheritance baca file daripada Model
    //return true jika staffId dan pwd matched
    public boolean isExist(String staffId, String pwd){
        String sql = "SELECT * FROM users "
                     + "WHERE staff_id ='" + staffId + "' "
                     + "AND pwd = '" + pwd + "'";
        try{
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
            return false;
    }
    
    
    public static void main(String[] args){ //nak test jalan ker tidak password yang betul tersebut
        UserModel model = new UserModel();
        if(model.isExist("111111", "1234")){
            System.out.println("ok");
        }else{
            System.out.println("ko");
        }
    }
}
