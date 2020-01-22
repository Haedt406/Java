
package sortlab;

import java.util.Scanner;

/**
 *
 * @author Benjamin Haedt
 */
public class SortLab {

    
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = console.nextInt();
        int[] stuff = new int[size];
        int[] stuff2 = new int[size];
        int[] stuff3 = new int[size];
        long startTime;
        long finishTime;
         for (int i = 0; i < stuff.length; i++)
        {
            stuff[i] = new Integer ((int) (Math.random() * size));
            stuff2[i] = stuff[i];
            stuff3[i] = stuff[i];
        }
        System.out.println("Array before insertion sort: ");
        for (int i = 0; i < stuff.length; i++){
            System.out.print(stuff[i] + " ");
        }
        System.out.println("\n");
        startTime = System.currentTimeMillis();
        InsertionSort.sort(stuff);
        finishTime = System.currentTimeMillis();
        System.out.println("Array after insertion sort: ");
        for (int i = 0; i<stuff.length; i++){
            System.out.print(stuff[i] + " ");
        }
        System.out.println("\n");
        System.out.println("The time in milliseconds to sort " + size + " items is " + (finishTime - startTime) + " with Insertion Sort");
        System.out.println("\n");
        
        System.out.println("Array before bubble sort: ");
        for (int i = 0; i<stuff2.length; i++){
            System.out.print(stuff2[i] + " ");
        }
                System.out.println("\n");
        startTime = System.currentTimeMillis();
        bubbleSort.sort(stuff2);
        finishTime = System.currentTimeMillis();
        System.out.println("\n");
        System.out.println("Array after bubble sort: ");
        for (int i = 0; i<stuff2.length; i++){
            System.out.print(stuff2[i] + " ");
        }
        System.out.println();
        System.out.println("The time in milliseconds to sort " + size + " items is " + (finishTime - startTime) + " with Bubble Sort");
        System.out.println("\n");
        
        
        System.out.println("Array before selection sort: ");
        for (int i = 0; i<stuff3.length; i++){
            System.out.print(stuff3[i] + " ");
        }
        System.out.println("\n");
        startTime = System.currentTimeMillis();
        selectionSort.sort(stuff3);
        finishTime = System.currentTimeMillis();
        System.out.println("\n");
        System.out.println("Array after selection sort: ");
        for (int i = 0; i<stuff3.length; i++){
            System.out.print(stuff3[i] + " ");
        }
        System.out.println();
        System.out.println("The time in milliseconds to sort " + size + " items is " + (finishTime - startTime) + " with selection Sort");
        System.out.println("\n");
        
    }
    
}
