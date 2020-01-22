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
public class HourlyEmp extends Employee {
    protected int wage;
    protected int hoursWorked;
    
 HourlyEmp(int id, String first, String last, int wage, int hours){
     this.hoursWorked = hours;
     this.wage = wage;
     super.first = first;
     super.last = last;
     super.idNumber = id;
 }
    
    public int gethoursWorked(){
        return this.hoursWorked;
    }
    public int getWage(){
        return this.wage;
    }    
    public void setWage(int wage){
        this.wage = wage;   
    }
    public void sethoursWorked(int hours){
        this.hoursWorked = hours;   
    }
}
