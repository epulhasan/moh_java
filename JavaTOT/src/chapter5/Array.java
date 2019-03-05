
package chapter5; //step 1
//int bonus = salary>90000?3000:2000 --if salary>9000, bonus 3000 else 2000

public class Array { //step 1
    public static void main(String[] args){
        // $people = [] -> php
        String[] people = new String[3]; // bil data dalam array = 3; fixed
        people[0] = "Abu"; // assigned kepada array
        people[1] = "Ali";
        people[2] = "Ramasamy";
        
        System.out.println(people[2]);
        
       
       // int[] bil = new int; - x boleh - untuk data primitive
       Integer[] bil = new Integer[5];//step 2
       int[] jumlah = {1,2,4}; //boleh jga guna cara ini 
       
       //LOOPS
       for (int i=0; i<jumlah.length; i++){ //step 3
           System.out.println(jumlah[i]);
       }
       
       //...While
       int j = 0; // step4
       while(j< jumlah.length){
           //System.out.println(jumlah[j]);
           System.out.printf("Val = %s", jumlah[j]);
           j++;
       }
    }
}
