
package gameofnim;
import java.util.*;
/**
 *
 * @author Benjamin Haedt
 */
public class GameOfNIM {

    public static void main(String[] args) {

        int switchNumber = 1;
        Scanner console = new Scanner(System.in);
        while (switchNumber != 0){
            System.out.println("*********************************************************");
            System.out.println("Welcome to the Wild and Wacky game of NIM!");
            System.out.println("The player who takes the last 'marble' loses.");
            System.out.println("Think you have what it takes to win at this exciting game?"); 
            System.out.println();   
            System.out.println("*********************************************************"); 
            System.out.println();  
            System.out.println("Enter 1 to play and 0 to quit.");  
            System.out.println();  
            switchNumber = console.nextInt();
            switch(switchNumber){
                case 1:
                    Nim newGame = new Nim();                  
                    break;
                case 0:
                    break;
                   
            }
        }
    }
    
}
