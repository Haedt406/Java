/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Togusa
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Engineering c = new Engineering(6);
        Engineering r = new Engineering(6,7);
        
        c.changelength(4);
        double ans = c.Circle();
        c.changelength(-11);
        ans=c.Circle();
        ans=c.Rectangle();
        r.changelength(-5);
        double ans2=r.Rectangle();
        ans2=r.Circle();
        
        
        
    }
    
}
