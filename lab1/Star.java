/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Togusa
 */
public class Star {
    private String Name;
    private int MoneyEarned;
    private int Arrests;
    private int Avg;
    
    public Star(String Name, int MoneyEarned, int Arrests)
    {
        this.Name = Name;
        this.MoneyEarned = MoneyEarned;
        this.Arrests = Arrests;
        
    }
    public int MoneyAfterArrests(int Fines)
    {
        Avg = MoneyEarned - (this.Arrests * Fines);
        return Avg;
    }
    
    public void PrintSelf()
    {
        System.out.println(this.Name + " has been arrested " + this.Arrests + " times and she has $" + this.Avg);
    }
    
}
    

