//step 1- fail ProjectModel.java daripada Models - Starting kena buat source code
package models;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList; // kena import

public class ProjectModel extends Model{ //step 6 - extends model
    //step 2
    private int id; 
    private String title;
    private String description; 

    public ArrayList getAll(){ //step 1 - functiongetAll
        ArrayList arr = new ArrayList(); // step 3 - create object
        String sql = "SELECT * FROM project"; //step 5
        try{ //step 7
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                ProjectModel pro = new ProjectModel();
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                arr.add(pro);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return arr; //step 4
    }
    //step 9 - add library di Libraries > Right Klik > Add Library > MYSQL JDBC Driver > Klik > Add Library > tunggu sehingga siap (akan ambil masa sedikit..tunggu)
    public static void main(String[] args){ //step 8- untuk check kita punya baca ke dalam db daj jadi ker belum
        ProjectModel p = new ProjectModel();
        ArrayList list = p.getAll();
        for(int i=0; i<list.size(); i++){
            ProjectModel pro = (ProjectModel) list.get(i);
            System.out.println(pro.title);
                    
        }
    }
    
    //encapsulation- step 10- function tolong generated private title 
    //cara - Right Klik > Insert Code > Getter and Setter > klik semua - then, ianya akan buat automatik
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}