/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forlooplab;
import java.util.Random;
/**
 *
 * @author Togusa
 */
public class ForLoopLab {
    int a[] = {4, 5, 2, 1, 6, 6, 4, 3, 2, 6};;
ForLoopLab()
{
    
}
    public void stepOne(){
        for(int i : a)
            System.out.print(i + ", ");
        System.out.println("\n**********************");
    }
    public void stepTwo(){
        for(int i = a.length-1 ; i>=0; --i)
            System.out.print(a[i] + ", ");
        System.out.println("\n**********************");       
    }
    public void stepThree(){}
    int largest = a[0];
    int second = a[1];
        if (largest < second){
            int temp = largest;
            largest = second;
            second = temp;
}
        for(int i : a){
            if (largest <i)
                largest = i;

            else if (second <i)
                second = i;
}
                
                
        System.out.print(i + ", ");
    public static void main(String[] args) {
        ForLoopLab fll = new ForLoopLab();
        fll.stepOne();
        fll.stepTwo();
        fll.stepThree();
    }
    
}
