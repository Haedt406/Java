/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author Togusa
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args)  
{     System.out.println(calling(1, 12, 10));
String answer = recur("Go Bobcats!", 3);
System.out.println(answer);
}   
public static int calling(int first, int last, int n)  
{        int returnValue;      
System.out.println("Enter: first=" +  first +" last = "+last);    
int mid = (first+last)/2;     
if(mid*mid<=n) returnValue=mid;
else returnValue = calling(first, mid-1, n);  
System.out.println("Leave: first = " +first + " last = "+last +" mid ="+ mid);     
return returnValue;   }

public static String recur(String s, int i){
    i--;
    if (i>0){
        s = s+ recur(s,i);
     
    }
        return s;
}
} 
