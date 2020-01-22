
package blackjack31;
/**
 *
 * @author Benjamin Haedt
 */
public class Player {
    public int points = 500;
    //int type = 0; // 0 == plyer ;  1 == dealer;
    
    
    public Player(int player){
       this.points = points;    
    }
   public void WinPoints(int changePoints){
       this.points = this.points + changePoints;
   }
    public void LosePoints(int changePoints){
       this.points = this.points - changePoints;
       
}
    public void PrintPoints(){
        System.out.println("Your point total is : " + this.points);
    }
    
}
