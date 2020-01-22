/*
 * CSCI 132 Basic Data Structures and Algorithms
 * 
 * 
 */
package blackjack31;
import java.util.*;
//import java.util.Random;
/**
 *
 * @author Benjamin Haedt
 */
public class BlackJack31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        Scanner console = new Scanner(System.in);
        
        while (x != 0){
            Game game = new Game();
            System.out.println("Welcome to 31 Blackjack");
            System.out.println("Enter how many players there are, (1-4)");
            System.out.println("Enter 0 to quit");  
            x = console.nextInt();
            switch (x) {
                case 1:
                    
                    System.out.println("How much would you like to bet? ");
                    int bet = console.nextInt();
                    game.Play(bet);
                    break;
                case 2:
                    //game.Play(2);
                    break;
                case 3:
                    //game.Play(3);
                    break;
                case 4:
                    //game.Play(4);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please enter 0 to quit or how many players there are from 1-4");
                    break;
            }
        }
        System.out.println("Goodbye");
    }
    
}
