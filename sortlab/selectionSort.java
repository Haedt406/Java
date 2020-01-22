/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortlab;

/**
 *
 * @author Benjamin Haedt
 */
class selectionSort {

    static void sort(int[] stuff3) {
        int out;
        int in;
        int min;
        for(out=0; out<stuff3.length-1; out++) // outer loop
            {
                   min = out; // minimum
                   for(in=out+1; in<stuff3.length; in++) // inner loop
                         if(stuff3[in] < stuff3[min] ){ // if min greater,
                                  min = in; // we have a new min

                         }//end of if
                    int temp = stuff3[out];
                    stuff3[out] = stuff3[min];
                    stuff3[min] = temp;
               }///end of for(in)
      } // end for(out)

} // end selectionSort
//        
//        for (int i=0; i < stuff3.length; i++){
//            max = stuff3[i];
//            for(int j = 0; j < stuff3.length; j++){
//                if(max < stuff3[j]){
//                   max = stuff3[j];
//                   temp = stuff3[j];
//                }
//            }
//            stuff3[stuff3.length -i] = ;
//            stuff3[stuff3]
//            
            
//            min = i;
//            for(int j = i+1; j < stuff3.length; j++){
//                if (stuff3[j] < stuff3[min]){
//                    min = stuff3[j];
//                    temp = stuff3[i];
//                    stuff3[i] = stuff3[min];
//                    stuff3[min] = temp;
//                    
//                }
//            }
        
