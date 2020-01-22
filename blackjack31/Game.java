
package blackjack31;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Benjamin Haedt
 */
public class Game {
   Random ran = new Random();
   Scanner console = new Scanner(System.in);
   public Card myDeck[];
   public Card dealerHand[];
   public Card player1Hand[];
   public Card newHand[];
    Player player1 = new Player(1);
   
   
    Game(){
        
     
    }   
        public void Play(int bet){
            int stayOrHit = 0;
          
            
           myDeck = new Card[52];
            int count = 0;
            for (int i = 0; i<4; i++){
                for (int j = 0; j<13; j++){
                    myDeck[count++] = new Card(i,j);
                    }
            }
             while (player1.points > 0){
               
            
          
            CreateHands();
            System.out.println("Player one points: " +Points());
            while (true){
            System.out.println("Would you like to stay or hit?");
            System.out.println("Enter 1 to hit or 2 to stay");
            stayOrHit = console.nextInt();
            if (stayOrHit == 1){
                AddCard();
            }
            if (stayOrHit == 2){
                break;
            }
            }


            if (Points() > 31){
                System.out.println("You went over 31 and loose this round, you had " + Points() + " Points.");
                player1.LosePoints(bet);
                player1.PrintPoints();
                System.out.println("******************************************");
            System.out.println("How much would you like to bet? ");
            bet = console.nextInt();
            Play(bet);
            }
            
            
            System.out.print("The Dealers cards are: ");
                for (int i = 0; i < dealerHand.length; i++){
                System.out.print(dealerHand[i].myDeck());
                }
                System.out.println("");
             while (DealerPoints() < 26){
                 AddDealerCard();
                 DealerPoints();
             }
             if (DealerPoints() > 31){
                 System.out.println("The Dealer went over 31 and lost this round");
                player1.WinPoints(bet);
                player1.PrintPoints();
                System.out.println("******************************************");
            System.out.println("How much would you like to bet? ");
            bet = console.nextInt();
            Play(bet);
             }
             if (DealerPoints() > Points()){
                 System.out.println("The Dealer has " + DealerPoints() + ".  The Player has " + Points() + "\n You Loose this round.");
                player1.LosePoints(bet);
                player1.PrintPoints();
                System.out.println("******************************************");
            System.out.println("\nHow much would you like to bet? ");
            bet = console.nextInt();
            Play(bet);
             }
             if (DealerPoints() < Points()){
                 System.out.println("The Dealer has " + DealerPoints() + ". \n The Player has " + Points() + "\n You Win this round!");
                player1.WinPoints(bet);
                player1.PrintPoints();
                System.out.println("******************************************");
            System.out.println("\nHow much would you like to bet? ");
            bet = console.nextInt();
            Play(bet);
             }
               if (DealerPoints() == Points()){
                 System.out.println("The Dealer has " + DealerPoints() + ". \n The Player has " + Points() + "\n It is a tie game!");
                player1.PrintPoints();
                System.out.println("******************************************");
            System.out.println("\nHow much would you like to bet? ");
            bet = console.nextInt();
            Play(bet);
             }
             }
            
             System.out.println("Player 1 has ran out of credits.");
            
             
        }
       
        
        public void AddDealerCard(){
            int handLength = dealerHand.length;
            int length = handLength + 1;
            newHand = new Card[length];
             int nextRan = ran.nextInt(0x34);
             while (myDeck[nextRan] == null){
                nextRan = ran.nextInt(0x34);
              }    
             for (int i = 0; i < dealerHand.length; i++){
                 newHand[i] = dealerHand[i];
             }
               newHand[length-1] = myDeck[nextRan];
                    myDeck[nextRan] = null;
                dealerHand = newHand;
                System.out.println("The Dealer drew a: " + newHand[length-1].myDeck());               
        }
        public void AddCard(){
            int handLength = player1Hand.length;
            int length = handLength + 1;
            newHand = new Card[length];
             int nextRan = ran.nextInt(0x34);
             while (myDeck[nextRan] == null){
                nextRan = ran.nextInt(0x34);
              }    
             for (int i = 0; i < player1Hand.length; i++){
                 newHand[i] = player1Hand[i];
             }
               newHand[length-1] = myDeck[nextRan];
                    myDeck[nextRan] = null;
                player1Hand = newHand;
                
                System.out.println("Player ones cards: ");
                for (int i = 0; i < player1Hand.length; i++){
                System.out.print(player1Hand[i].myDeck());
                }
                System.out.println("\nPlayer ones points: " +Points());
                System.out.println("");
                
        }
        
        public void CreateHands(){
            dealerHand = new Card[3];
            player1Hand = new Card[3];
            
            for (int i = 0 ; i < 3; i++){
                int nextRan = ran.nextInt(0x34);
                while (myDeck[nextRan] == null){
                    nextRan = ran.nextInt(0x34);
                }
            
                    dealerHand[i] = myDeck[nextRan];
                    myDeck[nextRan] = null;
            }
            
            System.out.print("The dealers first card is a: " + dealerHand[0].myDeck() + "\n");

                for (int i = 0 ; i < 3; i++){
                int nextRan = ran.nextInt(0x34);
                while (myDeck[nextRan] == null){
                    nextRan = ran.nextInt(0x34);
                }    
                    player1Hand[i] = myDeck[nextRan];
                    myDeck[nextRan] = null;
                
                }
                System.out.print("Player ones cards: ");
                for (int i = 0; i < player1Hand.length; i++){
                System.out.print(player1Hand[i].myDeck());
                }
                System.out.println("");
            }

        public int Points(){
            int player1Points = 0;
            int aceCounter = 0;
            for (int i = player1Hand.length; i>0; i--){
                if (player1Hand[i-1].getNumbers() == "A"){
                    aceCounter +=1;
                }
                else{
                    player1Points += player1Hand[i-1].getValue();
                }
                
                } 
            for (int i = aceCounter; i > 0 ; i--){
                if (player1Points > 20){
                    player1Points += 1;
                }
                else{
                    player1Points += 11;
                    
                }  
                }
            return player1Points;
        }
        public int DealerPoints(){
            int aceCount = 0;
             int dealerPoints = 0;
        for (int i = dealerHand.length; i>0; i--){
                    if (dealerHand[i-1].getNumbers() == "A"){
                    aceCount +=1;
                }
                else{
                    dealerPoints += dealerHand[i-1].getValue();
                }
                
                } 
            for (int i = aceCount; i > 0 ; i--){
                if (dealerPoints > 20){
                    dealerPoints += 1;
                }
                else{
                    dealerPoints += 11;
                    
                }   
                }
            return dealerPoints;
}
}
//        public void printDeck(){
//         for (int i = 0; i < 52; i++){
//             if (myDeck[i] != null){
//                System.out.println(myDeck[i].myDeck() + " ");
//             }
//             else{;}
//         }
//            
//    }
//}
