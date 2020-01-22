/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

/**
 *
 * @author Togusa
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String answer = recur("Go Bobcats! ", 3);
        System.out.println(answer);
    }
    
    public static String recur(String s, int i){
        i--;
        while (i>0){
            s = s + s;
            recur(s, i);
        }
        return s;
        
    }
}
