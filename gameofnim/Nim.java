
package gameofnim;
import java.util.*;

/**
 *
 * @author Benjamin Haedt
 */
public class Nim {
        Random randomInt = new Random();
        Scanner console = new Scanner(System.in);
        int bagOMarbles = randomInt.nextInt(91) + 10;
        int whoGoesFirst= randomInt.nextInt(2);
        //int smartorStupid= randomInt.nextInt(2);
        int smartorStupid = 1;
        int whoWins;
        Nim(){
            if (smartorStupid == 0){
                System.out.println("Computer is playing 'stupid'");
            }
            else{
                System.out.println("Computer is playing 'smart'");
            }
            if (whoGoesFirst == 0){
                System.out.println("Computer is going first");
            }
            else{
                System.out.println("Player is going first");
            }
            if (whoGoesFirst == 1){
                PlayerFirst();
            }
            if (whoGoesFirst == 0){
                ComputerFirst();
            }
        }
        private int ComputerTurn(int iq, int bagOMarbles){
            int take;
            switch (iq){
            case 0:
                int scope = bagOMarbles/2;
                if (scope == 0){
                    take = 1;
                }
                else {
                take = randomInt.nextInt(scope)+1; 
                }
                bagOMarbles -= take;
                System.out.println("Computer took " + take + " Marbles.");
                break;
            case 1:
                if(bagOMarbles <= 2){
                    bagOMarbles -= 1;
                    System.out.println("Computer took " + 1 + " Marbles.");
                    break;
                }
//                do{
//                    i++;
//                    take = (int)Math.pow(2, i)-1;
//                    System.out.println(i);  
//                }while (take <= bagOMarbles);
//                int difference = bagOMarbles - (int)Math.pow(2,i) -1;
//                bagOMarbles -= difference;
//                System.out.println("Computer took " + difference + " Marbles.");
//                
//                    
                
            else{
                for (int i = 0; i < 8; i++){
                    //take = (2^i) - 1;
                    take = (int)Math.pow(2, i);
                    take -= 1;
                    if (take > bagOMarbles){
                        int difference = bagOMarbles - (int)Math.pow(2,i-1) +1;
                        bagOMarbles -= difference;
                        System.out.println("Computer took " + difference + " Marbles.");
                        break;
                    }
                }
            }
//                break;
//                
//                   else{
//                    take = randomInt.nextInt(bagOMarbles);
//                    bagOMarbles -= take; 
//                    System.out.println("Computer took " + take + " Marbles.");
//                    break; 
            }
            return bagOMarbles;

        }
        
                
            
        
        private void PlayerFirst(){
            
            while (bagOMarbles > 0){
            System.out.println("There are " + bagOMarbles + " marbles.");
            System.out.println("How many marbles would you like to take?");
            int take = console.nextInt();
            bagOMarbles -= take;
            System.out.println("You took " + take + " marbles.");
            System.out.println("There are " + bagOMarbles + " marbles.");
            if (bagOMarbles <= 0){
                EndGame(1);
                break;
            }
            bagOMarbles =  ComputerTurn(smartorStupid, bagOMarbles);
            if (bagOMarbles <= 0){
                EndGame(0);
                break;
            }            
            }
            
        }
        private void ComputerFirst(){
            
            while (bagOMarbles > 0){
            bagOMarbles =  ComputerTurn(smartorStupid, bagOMarbles);
            if (bagOMarbles <= 0){
                EndGame(0);
                break;
            }
            System.out.println("There are " + bagOMarbles + " marbles.");
            System.out.println("How many marbles would you like to take?");
            int take = console.nextInt();
            bagOMarbles -= take;
            System.out.println("You took " + take + " marbles.");
            System.out.println("There are " + bagOMarbles + " marbles.");
            if (bagOMarbles <= 0){
                EndGame(1);
                break;
            }

            }            
            }
        
        private void EndGame(int whoWon){
                    if (whoWon == 0){
                        System.out.println("You Win!");
                    }
                    else{
                         System.out.println("You Lose!");
                    }            
        }
        
}
