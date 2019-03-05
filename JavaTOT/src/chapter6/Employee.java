
package chapter6;  //step 2

public class Employee implements Payable {  //step 2
    
    @Override
    public boolean increasePay(int percent) { //step 3
        return true;
    }  
    
    @Override
    public void cetak(){ //step 5 - kita override dalam interface
        
    }
}
