/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab103;

/**
 *
 * @author Togusa
 */
public class StringsLab {
     public static int countVowels(String input)
     {
         int count = 0;
         String regex = "[aeiou]";
//        String[] regex = new String[5];
//        regex[0] = "a";
//        regex[1] = "e";
//        regex[2] = "i";
//        regex[3] = "o";
//        regex[4] = "u";
        for (int i  = 0; i < input.length(); i++){
            for (int j = 0; j < regex.length();i++){
                if (regex[i] == input[i]){
                    count++;
                }
            }
        }
         return count;
     }
          public static String[] returnEachWord(String input)
     {
       // return " ";  
     }
     public static String removeWhiteSpace(String input)
     {
    //3. Remove all white space in a String, including beginning and ending white space
         return input;        
     }
}

