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
class bubbleSort {

    static void sort(int[] stuff) {
        int sorts = 1;
        int n = stuff.length;
        int temp;
            boolean win = true;
        for(int j = 0; j < n; j++){
            if(!win){
                break;
            }
            win = false;
            for(int i = 0; i < n -1; i++){
                if (stuff[i]  > stuff[i+1]){
                    temp = stuff[i+1];
                    stuff[i+1] = stuff[i];
                    stuff[i] = temp;
                    win = true;
                }
            }
        }

    }
    
}
