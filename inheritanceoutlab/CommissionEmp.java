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
public class CommissionEmp extends Employee{
    protected int commissionRate;
    protected int grossSales;

   
    public int getCommissionRate(){
        return this.commissionRate;
    }
    public int getGrossSales(){
        return this.grossSales;
    }    
    public void setCommissionRate(int commissionRate){
        this.commissionRate = commissionRate;   
    }
    public void setGrossSales(int grossSales){
        this.grossSales = grossSales;
        
    }
}