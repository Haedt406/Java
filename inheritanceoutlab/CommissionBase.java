/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceoutlab;

/**
 *
 * @author Benjamin Haedt
 */
public class CommissionBase extends CommissionEmp {
    protected int baseWage;
    
    public int getWage(){
        return this.baseWage;
    }    
    public void setWage(int wage){
        this.baseWage = wage;   
    }

}
