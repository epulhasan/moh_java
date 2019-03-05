
package chapter4; //step 1
/*
discuss on "static" keyword
- apply to variable and method
- shared 
*/
public class Book { //step 1
     static int bil = 0; //keyword static - shared by all and own by class ex; acuan yang boleh kira jumlah dibuat bukan baulu
     String title;
     
     // dia own by class bukan own by object
     public static void cetak(){ //step 4 - this is a method sbb ada public - static digunakan di method
         System.out.println("Jumlah buku = " + Book.bil);
         
     }
     
     /*public void info(){ //step 6
         
     }*/
     
     
     Book(){ // step 3 
         Book.bil = Book.bil + 1;
         System.out.println("Bil buku = " + Book.bil);
     }
     
     public static void main(String[] args){ //step 2
         Book b1 = new Book(); //b1 dan b2 - adalah object
         Book b2 = new Book();
         Book.cetak(); // boleh jg buat cetak(); step 5 - ambil di method cetak - function static boleh panggil function static jg
         //info(); step 7 - akan error daripada step 6
     }
}
