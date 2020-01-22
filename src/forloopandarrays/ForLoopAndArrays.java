/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopandarrays;

/**
 *
 * @author Togusa
 */
public class ForLoopAndArrays {

public static void main(String[] args) {
        
        
        int firstArray[] = {1, 9, 2, 5, 22, 8, 10,14, 2, 6};
        
        System.out.println(firstArray[5]);
        System.out.println("FirstArray " + firstArray);
     
       
        for(int i = 0; i<firstArray.length; i++)
        {
            System.out.println(firstArray[i]);
        }
        System.out.println("*********************");
        
        for (int i : firstArray)
            System.out.print(i+ ", ");
           System.out.print("\n*********************\n");
        int myArray[] = new int[10];

        for (int i = 0; i<myArray.length; i++)
        {
            myArray[i] = i * 2;
        }
        
        for (int i = 0; i<myArray.length; i++)
        {
            System.out.print(i + ", ");
        }

    }
    
}

