
package sortlab;

/**
 *
 * @author Benjamin Haedt
 */
class InsertionSort {

    static void sort(int[] stuff) {
        int temp;

        
        for (int i = 1; i<stuff.length;i++){
           temp = stuff[i];
           int count = i;
           while (count > 0 && stuff[count-1] > temp){
               stuff[count] = stuff[count -1];
               count--;
           }
           stuff[count] = temp;
        }

    }
    
}
