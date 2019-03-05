//1 class ada lebih method

package chapter4; //step 1
//primitive + String = passing by value
//object always by reference

// pass variable by val vs by reference
public class Student { //step 1 
    void setName(String name) { // create method biasa - original untuk object student
        System.out.println(name);
        name = name + "bin Hasan";
    }

    void changeBookTitle(Book b){ //step 4 - original untuk object book
        b.title = "Java Advanced";
    }
    
    public static void main(String[] args){ //step 2 - main method
         Student s1 = new Student(); //create obj
         String nama = "Saiful Bahari";
         //ini passing var by value - original coding tidak berubah yang method setName tidak berubah
         s1.setName(nama);
         System.out.println(nama);
         
         //passing var by reference - buktikan yang koding original berubah
         Book b1 = new Book(); //step 3 - create another obj
         b1.title = "Java For Beginner";
         System.out.println(b1.title);
         s1.changeBookTitle(b1); // step 5
         System.out.println(b1.title);
         

    }
}
