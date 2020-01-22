/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introoosecondclass;

/**
 *
 * @author Togusa
 */
public class IntroOOSecondClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecondClass sc = new SecondClass(99);
        SecondClass second = new SecondClass(432);
        
        System.out.println(sc.returnID());
        System.out.println(second.returnID());
    }
    
}
