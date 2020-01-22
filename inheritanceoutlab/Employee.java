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
public abstract class Employee {
    protected String first;
    protected String last;
    protected int idNumber;
   
    Employee(){
//        this.first = firstN;
//        this.last = lastN;
//        this.idNumber = id;
    }
    
    public void setFirst(String newFirst){
     this.first = newFirst;   
    }
    public void setLast(String newLast){
     this.last = newLast;   
    }
    public void setID(int newID){
     this.idNumber = newID;   
    }
    public String getFirst(){
        return this.first;
    }
    public String getLast(){
        return this.last;
    }
    public int getidNumber(){
        return this.idNumber;
    }
}
