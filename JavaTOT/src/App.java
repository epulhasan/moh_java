//main() berada didalam satu class khusus yang akan guna class-class yang lain

public class App {
    //entry point method (dalam object dipanggil method)- wajib
    public static void main(String[] args){ //args je boleh tukar as param dll
        // create object
        Car ferrari = new Car();
        ferrari.numberOfDoors = 2;
        ferrari.color = "red"; //mesti "" xboleh '' 
        //'' ini hanya utk char sahaja
        ferrari.print();
        ferrari.startEngine();
        Car porsche = new Car();
        
    }
    
}
