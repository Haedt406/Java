/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringslab;

import static java.lang.System.console;
import static java.lang.System.out;
import java.util.Scanner;
import static javafx.beans.binding.Bindings.convert;

/**
 *
 * @author Hunter
 */
public class Stringslab {
     public static int countVowels(String input)
     {
         int count = 0;
         String regex = "[aeiou]";
         //int count = input.compareToIgnoreCase(regex);
//         input.matches(regex);
//             count++;
            // count = input.regionMatches(0, regex, 0, 0);
          //count = input.contains(regex);
          String two = input.replaceAll(regex, "");
          count = input.length() - two.length(); 
         return count;
     }
     public static String[] returnEachWord(String input)
     {
       //int length = input.length();
         String[] words = new String[input.length()];
         
       //String[] words = input.split(" ");
       return words;
     }
     public static String removeWhiteSpace(String input)
     {
        int begin = 0;
        int end = 0;
        String edited = "";
        String add = " ";
        char test = ' ';
        input = input.concat(add);
         //input = input.replaceAll(" ","");
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == test){
                begin = end;
                if (begin > 1){
                    ++begin;
                }
                end = i;
                String str = input.substring(begin, end);
               // System.out.println(str);
                edited = edited.concat(str);  
                
         
            }
            
        }
         return edited;        
     }
     
     
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
}