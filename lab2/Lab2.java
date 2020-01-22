/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Togusa
 */
public class Lab2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lab2 lab = new Lab2();
        Random ran = new Random();
         //int myArray[] = new int[10];
         int myArray[] = {9,4,5,6,7,3,2,2,9,9};
        //for (int i = 0; i < myArray.length; i++){
         //   myArray[i] = i;
          //myArray[i] = ran.nextInt(10);
          for (int i = 0 ; i < myArray.length  ; i++){
               System.out.print(myArray[i]);
          }
            
         //}
                              System.out.println("\n**********************"); 
        lab.partTwo(myArray); 
    //part three
             int largest = myArray[1];
             int second = myArray[0];
             
         for (int i = 0; i < myArray.length; i++){ 
             if (largest < myArray[i]){
                 second = largest;
                 largest = myArray[i];
             }
             else if (second < myArray[i]);{
                 second = myArray[i];
         }
         }   
           //for(int j : myArray){
            //if (largest < j)
            //    largest = j;
           // else if (second < j)
            //    second = j;
           System.out.print(second);       
         System.out.println("\n**********************");
         //part four
         float total = 0;
         float avg = 0;
         
         for (int i = 0; i < myArray.length; ++i){
             
             total += myArray[i];
             avg = total / (float)myArray.length;  
             
         }
         System.out.printf("%.2f", avg);
         System.out.println("\n");
         lab.partSix(myArray);
         lab.partSeven(myArray);
         }
    
    
    public void partTwo(int[] myArray){
         for (int i = 9; -1 < i; --i){
             System.out.print(myArray[i]);
         }
        System.out.println("\n**********************"); 
         }
    public void partSix(int[] myArray){
        for (int i =0; i < myArray.length; i++){
            for (int j = myArray[i]; j >0 ; j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
    public void partSeven(int[] myArray){
        int count = 0;
        int var = myArray.length;
        int nArray[] = new int[10];
        for (int i =0; i < myArray.length; i++){
            for (int j = 0; j < myArray.length; j++){
                if (myArray[j] == i)
                    nArray[i] += 1;
               
            }
            
        }
        for (int i =0; i < myArray.length; i++){
            if (nArray[i] != 0)
                    System.out.print("The number "+ i + " is in the array "+ nArray[i] + " times.\n");
            
        }
    }
}

