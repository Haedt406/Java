/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forlab;
import java.util.Random;

/**
 *
 * @author Togusa
 */
public class ForLab {
    int myArray[];
    
    public ForLab()
    {
        Random ran = new Random();
        myArray = new int[10];
        
     for (int i = 0; i < myArray.length; i++)
         myArray[i] = ran.nextInt(99) + 1;
    }
    
   
    public void printArray()
{
    for (int i = 1; i<myArray.length; i++)
    System.out.println(myArray[i]);
}
    public static void main(String[] args) {
    ForLab fl = new ForLab();
    fl.printArray();
        int counter = 0;
        while(counter < 10){
            //counter = counter + 1
     System.out.println(counter++);
  }
        int i = 0;
    for  (i = 1; i < 10; i++){
        System.out.println("for: " + i);  
    }
        System.out.println("Done " + i);
        do{
        System.out.println(i);
        i++;
        } while (i < 13);
    
}
}