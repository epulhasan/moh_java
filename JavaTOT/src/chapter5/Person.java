
package chapter5; //step 1
//class members ada 2 perkara: 1. property  2. method
public class Person { //step 1
    String name;   //
    int age;       // ini semua adalah property - default property is a public
    String gender; //
    
    // di bawah tajuk encapsulation - Encapsulation is the ability to hide and protect data stored in Java objects
    private  String statusKahwin; //step 3  -- private tidak boleh diakses daripada class luar
    // di bawah tajuk encapsulation
    //public interface - untuk bagi jawapan pilihan utk diberi
    public String getStatusKahwin(String jenisOrang){ //step 4
        if(jenisOrang.equals("Kanak2")){
            return "Muda lagi";
        }else if(jenisOrang.equals("tansri")){
            return "Janda";
        }else{
            return "Bujang";
        }
        
        //return this.statusKahwin;
    }
    
    public void walk(){  // step 2- ini adalah method -- tak nak letak public pun tak per
        
    }
    
    public void talk(){ // step 2 - ini adalah method
        
    }
    
    void sing(){ // step 2 - ini adalah method
        
    }
}
