/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodinaclass;

/**
 *
 * @author Togusa
 */
public class Methodinaclass {
    
    public int myMethod(){
        
        System.out.println("Inside myMethod");
        return 6;
        
    }
    public static void main(String[] args) {
        Methodinaclass myClass = new Methodinaclass();
        int returnVal = myClass.myMethod();
        System.out.println(returnVal);
        final int MAX = 5;
    }
    
}
