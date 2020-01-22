
package nim;

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
        int smartorStupid= randomInt.nextInt(2);
        //int smartorStupid = 1; // this was used to test and i left it in so you can test smart mode
        int whoWins;

    public static void main(String[] args) { //the main method, calls Nim to create a new game
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
                    Nim game = new Nim();                  
                    break;
                case 0:
                    break;
                }
        }
    }
Nim(){ //the main instance of nim created to play and instance of the game.
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
        private int ComputerTurn(int iq, int bagOMarbles){ //determines how the computer plays and how many marbles it takes
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

            else{
                for (int i = 0; i < 8; i++){
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
            }
            return bagOMarbles;
        }

        private void PlayerFirst(){ // plays an iteration of the game with the player going first
            
            while (bagOMarbles > 0){
             PlayerTurn();
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
        private void ComputerFirst(){ //plays an iteration of the game with the computer going first
            int legalPlay = 0;
            while (bagOMarbles > 0){
            bagOMarbles =  ComputerTurn(smartorStupid, bagOMarbles);
            if (bagOMarbles <= 0){
                EndGame(0);
                break;
            }
            PlayerTurn();
            if (bagOMarbles <= 0){
                EndGame(1);
                break;
            }
            }            
            }
        private void PlayerTurn(){ //allows the player to take a turn and take marbles from the bag
            System.out.println("There are " + bagOMarbles + " marbles.");
            System.out.println("How many marbles would you like to take?");
            int take = console.nextInt();
            if (bagOMarbles >1){
            while (take < 1 || take > (bagOMarbles/2)){
            System.out.println("You have to take at least one marble but no more then half from the bag.");
            System.out.println("There are " + bagOMarbles + " marbles.");
            System.out.println("How many marbles would you like to take?");
            take = console.nextInt();
            }
            }
            else{
            while (take != 1){
            System.out.println("You have to take at least one marble but no more then half from the bag.");
            System.out.println("There are " + bagOMarbles + " marbles.");
            System.out.println("How many marbles would you like to take?");
            take = console.nextInt();
            }
            }
            
            bagOMarbles -= take;
            System.out.println("You took " + take + " marbles.");
            System.out.println("There are " + bagOMarbles + " marbles.");
        }
        
        private void EndGame(int whoWon){ // determines who won
                    if (whoWon == 0){
                        System.out.println("You Win!");
                    }
                    else{
                         System.out.println("You Lose!");
                    }            
        }
}
