/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Togusa
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Star lindsey = new Star("Lindsey", 800000, 7);
        System.out.println(lindsey.MoneyAfterArrests(300));
        lindsey.PrintSelf();
    }
    
}
