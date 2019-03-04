//Package- 
//1 class boleh ada banyak-banyak constructor
package chapter4; //step 1
/* //step 11
"this" - untuk set/get a property OR
call/run a method
ie this.jumlah = 100;
*/

public class LoanCalculator extends Calculator{ //step 2 // extend Calculator (step 9) - inheritance, konsep parent dan child
     int jumlah; // step 7 - variable/property
     final String tajuk = "LOAN CALCULATOR"; //step 18 - tidak boleh tukar value lain
     
     
    /* public void info(){ // step17 
    
    } 
    ini xboleh override sebab parent info() dah final
    */ 
    
    //ini override cetak dalam parent
    @Override // step 15 - annotation - akan hilangkan yang warna hijau 
    public void cetak(){ //step 13 - method overriding - tak return apa-apa mesti letak void kecuali constructor tidak apply konsep void
       // this.tajuk = "abc" // step 19 - error, dah final tidak boleh tukar
        System.out.println("cetak LoanCalculator");
    }
    
   
    // ctrl + space = show auto suggestions
    // psvm tab = auto gen pub  static void main()
    public  static void main(String[] args){ // step 6
        LoanCalculator cal = new LoanCalculator();
        cal.cetak(); //step 14 - berkaitan method overriding
        LoanCalculator cal2 = new LoanCalculator(1);

    }
    
    // method constructor - tiada return dan nama mesti sama dengan class
    // dalam satu class ada multiple constructor
    // auto run bila create new object
    // biasanya guna untuk initialize variable
    // constructor adalah default dan dia mesti public - tak letak pun takper
    public LoanCalculator(){ // step 4
        super(); //step 10- arahan run parent punya constructor 
        System.out.println("I'm in constructor");
    }
    
    public LoanCalculator(int amount){ // method constructor juga - tapi jenis ada parameter // step 5
        this.jumlah = amount; //initialize value awalan
        System.out.println("I'm in constructor 2");
        
    }
    
    // mesti return integer, void - no return
    public int calcLoanPayment(int amount, int numberOfMonths, String state) { //method arguments // step 3
        // Your code goes here
        return 0;
    }
    // shift + alt + F - untuk arrange code
    
    // dipanggil method overloading- satu function nama sama tapi parameter berbeza
    private int calcLoanPayment(int amount){ //step 8
        return 0;
    }
}
