/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab103;

import static java.lang.System.console;
import static java.lang.System.out;
import java.util.Scanner;
import static javafx.beans.binding.Bindings.convert;

/**
 *
 * @author Hunter
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    
        String answer = "yes";
        do{
           System.out.println("Give me a sentence you want to parse");
           String sentence = console.nextLine();
           sentence = sentence.toLowerCase();
           System.out.println("");
           System.out.println("Number of vowels using count     = " + countVowels(sentence));
           String output[] = returnEachWord(sentence);
           for(String x : output)
                  System.out.println(x);
           System.out.println("String without spaces = |" + removeWhiteSpace(sentence) + "|");
           System.out.println("");
           System.out.println("Would you like to continue: ");
           answer = console.nextLine();
           
        System.out.println("");
      }while(answer.equals("yes"));  
   }

