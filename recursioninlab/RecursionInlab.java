/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursioninlab;

import java.util.Scanner;

/**
 *
 * @author Togusa
 */
public class RecursionInlab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intInput;
        int intInput2;
        int length;
        boolean why;
        int gcd;
        String question;
        int whileLoop = 0;
        Scanner console = new Scanner(System.in);
        while (whileLoop != 3){
            System.out.println("-----------------------------Main Menu-----------------------------\n");
            System.out.println("1 to determine whether a string is a palandrome");
            System.out.println("2 to find the greatest common divisor of two numbers");
            System.out.println("3 to exit");
            System.out.println("----------------------------------");
            whileLoop = console.nextInt();
            switch (whileLoop) {
                case 1:{
                    System.out.println("Enter the string to determine if its a palandrome");
                    System.out.println("---------------------");
                    question = console.next();
                    length = question.length();
                    why = problem1(question, 0, length -1);
                   if (why == true){
                       System.out.println(question + " is a palandrome");
                   }
                   else{
                       System.out.println(question + " is not a palandrome");
                   }
                break;
                }
                case 2:{
                System.out.println("Enter 2 numbers to find the greatest common divisor shared between them");
                System.out.println("---------------------");
                intInput = console.nextInt();
                System.out.println("Entered " + intInput);
                intInput2 = console.nextInt();
                System.out.println("Entered " + intInput2);
                gcd = problem2(intInput, intInput2, 1, 1);
                System.out.println("the GCD of " + intInput + " and " + intInput2 + " is " + gcd);
                break;
    }
    
}
}
}
    public static boolean problem1(String test, int start, int end){
        if ((test.charAt(start))!= (test.charAt(end))){
          return false;}
        if(start < end +1)
            return problem1(test, start +1, end-1);
        return true;
    }
    
    public static int problem2(int number, int number2, int current, int gcd){
        if ((current != number) && (current != number2)){
            if ((number % current == 0) && (number2 % current == 0)){
                gcd = current;
            }
            current++;
            return problem2(number, number2, current, gcd);
        }
        return gcd;
    }
}
