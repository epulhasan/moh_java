//step 2 - buat signin form
package models;

import java.sql.ResultSet;
import java.sql.Statement;


public class UserModel extends Model{ //step 1 - inheritance baca file daripada Model
    private int id;  // step 3- 4 properties
    private String staffId;
    private String pwd;
    private String role;
    private String name;
    private String gender; //untuk daftar pengguna sistem

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() { //untuk daftar pengguna sistem .. getter and setter
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    //step 1 - untuk daftar pengguna sistem
    public boolean insert() {  //nak tahu berjaya simpan atau tak, guna boolean
        String sql = "INSERT INTO users(name, pwd, role, gender)"
                + "VALUES('"+this.name+"','"+this.pwd+"','"+this.role+"','"+this.gender+"')";
        try {
            Statement stmt = this.getStmt();
            stmt.execute(sql); //insert, update, delete guna execute()
        } catch (Exception e) {
            e.printStackTrace(); //untuk print error mesej to console
            return false;

        }
        return true;
    }

    
    
    //step 2 - return true jika staffId dan pwd matched 
    public boolean isExist(String staffId, String pwd){
        String sql = "SELECT * FROM users "
                     + "WHERE staff_id ='" + staffId + "' "
                     + "AND pwd = '" + pwd + "'";
        try{
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                //step 4- panggil daripada getter and setter untuk papar 
                this.id = rs.getInt("id");
                this.pwd = rs.getString("pwd");
                this.staffId = rs.getString("staff_id");
                this.role = rs.getString("role");
                this.name = rs.getString("name");
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
            return false;
    }
    
    
    public static void main(String[] args){ //ni option - nak test jalan ker tidak password yang betul tersebut
        UserModel model = new UserModel();
        if(model.isExist("111111", "1234")){
            System.out.println("ok");
        }else{
            System.out.println("ko");
        }
    }
}
