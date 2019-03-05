
package chapter5; //step 1
//class members ada 2 perkara: 1. property  2. method
public class Person { //step 1
    String name;   //
    int age;       // ini semua adalah property - default property is a public
    String gender; //
   
    private  String statusKahwin; //step 3  -- private tidak boleh diakses daripada class luar
    
    private String getStatusKahwin(){ //step 4
        return this.statusKahwin;
    }
    
    public void walk(){  // step 2- ini adalah method -- tak nak letak public pun tak per
        
    }
    
    public void talk(){ // step 2 - ini adalah method
        
    }
    
    void sing(){ // step 2 - ini adalah method
        
    }
}
