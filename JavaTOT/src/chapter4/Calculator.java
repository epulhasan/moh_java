
package chapter4; 
//this is a parent for extends calculator child
public class Calculator {
    //constructor
    public Calculator(){ //step selepas lakukan inheritance
        System.out.println("Calculator constructor");
    }
    // ctrl + e = delete a line
    
    public final void info(){ //step 16 - method ada perkataan final tidak boleh override
        
    }
    
    
    public void cetak(){ // step 12 - method overriding
        System.out.println("cetak calculator");
    }
}
