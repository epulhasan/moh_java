//step 1- fail ProjectModel.java daripada Models - Starting kena buat source code
package models;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList; // kena import

public class ProjectModel extends Model { //step 6 - extends model
    //step 2

    private int id;
    private String title;
    private String description;

    //step 11
    public boolean insert() {  //nak tahu berjaya simpan atau tak, guna boolean
        String sql = "INSERT INTO project(title, description)"
                + "VALUES('" + this.title + "','" + this.description + "')";
        try {
            Statement stmt = this.getStmt();
            stmt.execute(sql); //insert, update, delete guna execute()
        } catch (Exception e) {
            e.printStackTrace(); //untuk print error mesej to console
            return false;

        }
        return true;
    }

    //step 12
    public boolean delete(int id) {  //passing value guna int - nak tahu berjaya simpan atau tak, guna boolean
        String sql = "DELETE FROM project WHERE id = " + id;
        try {
            Statement stmt = this.getStmt();
            stmt.execute(sql); //insert, update, delete guna execute()
        } catch (Exception e) {
            e.printStackTrace(); //untuk print error mesej to console
            return false;

        }
        return true;
    }

    //step 13 - untuk dapatkan satu rekod untuk buat kemaskini
    public ProjectModel getOne(int id) {
        String sql = "SELECT * FROM project WHERE id = " + id;
        ProjectModel pro = new ProjectModel();

        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                pro.description = rs.getString("description");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pro;
    }
    
    
    //step 14
    public boolean update(int id) {  //passing value guna int - nak tahu berjaya simpan atau tak, guna boolean
        String sql = "UPDATE project SET " 
                      + "title = '" + this.title + "',"
                      + "description = '" + this.description + "' "
                      + "WHERE id = " + id;
        try {
            Statement stmt = this.getStmt();
            stmt.execute(sql); //insert, update, delete guna execute()
        } catch (Exception e) {
            e.printStackTrace(); //untuk print error mesej to console
            return false;

        }
        return true;
    }
    
    //step 15 - buat constructor - untuk kemaskini, set value supaya dia tak jadi null dalam field ie=
    public ProjectModel(){
        this.title = "";
        this.description = "";
    }
    
    // step 16 - untuk searching
        public ArrayList search(String title, String desc) { //step 1 - functiongetAll
        ArrayList arr = new ArrayList(); // step 3 - create object
        String sql = "SELECT * FROM project WHERE 1"; //step 5
        if(!title.equals("")) { //tidak empty
            sql += " AND title LIKE '%" + title + "%'";
        }
         if(!desc.equals("")) { //tidak empty
            sql += " AND description LIKE '%" + desc + "%'";
        }
         
        System.out.println(sql); //untuk print sql
         
        try { //step 7
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProjectModel pro = new ProjectModel();
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                pro.description = rs.getString("description");
                arr.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr; //step 4
    }

        
    public ArrayList getAll() { //step 1 - functiongetAll
        ArrayList arr = new ArrayList(); // step 3 - create object
        String sql = "SELECT * FROM project"; //step 5
        try { //step 7
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProjectModel pro = new ProjectModel();
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                pro.description = rs.getString("description");
                arr.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr; //step 4
    }

    //step 9 - add library di Libraries > Right Klik > Add Library > MYSQL JDBC Driver > Klik > Add Library > tunggu sehingga siap (akan ambil masa sedikit..tunggu)
    public static void main(String[] args) { //step 8- untuk check kita punya baca ke dalam db daj jadi ker belum
        ProjectModel p = new ProjectModel();
        ArrayList list = p.getAll();
        for (int i = 0; i < list.size(); i++) {
            ProjectModel pro = (ProjectModel) list.get(i);
            System.out.println(pro.title);

            p.setTitle("test"); //step 12 -- untuk test insert 
            p.setDescription("bla..bla..");
            p.insert();
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
