/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackslab;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Togusa
 */
public class StackStringCounter {
    String s;
Scanner console = new Scanner(System.in);
char stackArray[] = new char[20];
int index = 0;
int size = 0;

public void beginFun()
{

//String input = "000111";
//    for (int i = input.length(); i > 0; i--){
//        push(input.charAt(i));
//    }
 String input;
do{
    System.out.println("enter -1 to quit or 1 to enter a character");

   input = console.next();
  
   if ("-1".equals(input)){
       break;
   }
   else if (("1".equals(input))){
     System.out.println("enter string to push it into the stack");
     input = console.next();
     for (int i = 0; i < input.length(); i++){
         push(input.charAt(i));
     }
    //push(input.charAt(0));
}
   if (size == 0){
       System.out.println(input + " is a valid string");
   }
   else
   System.out.println(input + " is not a valid string");
   //System.out.println(size);


//System.out.println("Enter 0 or 1 into char array or -1 to exit");
//input = console.next();
//array = input.toCharArray();
//if (!input.equals("-1")){
//    System.out.println("enter 1 to pop the first element, 2 to push the first element from the top, or any key to continue to check the array");
//    input = console.next();
//    if (input.equals("1")){
//        pop();
//    }
//    if (input.equals("2")){
//        System.out.println("Enter 1 or 0 to put new character into array");
//        push();
//    }
//}
//
//System.out.println(array);
//runMethod();
}while(!input.equals("-1"));



}
private void runMethod(){
    
}
private void pop(){
//array[size] = null;
System.out.println("popped " + stackArray[size] + " at location " + size);
size--;


}
private void push(char test)
{
    System.out.println("Pushing " + test + ", size = " + size);
    int temp = size-1;
    if (temp == -1){
        temp = 0;
    }
    if ((stackArray[temp] != test) && (size > 0)){
        pop();
    }
    else{
    stackArray[size++] = test;
    //size++;
    //System.out.println(size);
    }
System.out.println("done pushing " + test + ", size = " + size);
}
    
}
