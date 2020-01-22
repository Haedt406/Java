
package blackjack31;



/**
 *
 * @author Benjamin Haedt
 */
public class Card {
    private final  String suit;
    private final  String number;  
    private final String suits[] = {"Clubs", "Hearts", "Spades", "Diamonds"};
    private final String numbers[] = {"A","2","3","4","5","6","7","8","9","10","Jack","Queen", "King"};
    
    public Card(int i, int j){
        this.suit = suits[i];
        this.number = numbers[j];
        
    }   
    public String getSuit() {
        return this.suit;
    }
    public String getNumbers(){
        return this.number;
    }
    public int SetValue(){
        int value = 1;
        return value;
    }
    public int getValue(){
        int points = 0;
//            if (this.number == "A"){
//                  points = 11;
//                return points;
//            }
            
             if (this.number == "2"){
                points = 2;
                return points;
            }
            else if (this.number == "3"){
                points = 3;
                return points;
            }
            else if (this.number == "4"){
                points = 4;
                return points;
            }
            else if (this.number == "5"){
                points = 5;
                return points;
            }
            else if (this.number == "6"){
                points = 6;
                return points;
            }
            else if (this.number == "7"){
                points = 7;
                return points;
            }
            else if (this.number == "8"){
                points = 8;
                return points;
            }
            else if (this.number == "9"){
                points = 9;
                return points;
            }
            else if (this.number == "10"){
                points = 10;
                return points;
            }
            else if (this.number == "Jack"){
                points = 10;
                return points;
            }
            else if (this.number == "Queen"){
                points = 10;
                return points;
            }
            else if (this.number == "King"){
                points = 10;
                return points;
            }
            else{
                return 0;
            }
        }
                
    
    public String myDeck(){
        return this.number + " of " + this.suit + ", ";
    }
}

     

