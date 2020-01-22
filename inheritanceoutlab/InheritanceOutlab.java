/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceoutlab;

import java.util.Scanner;

/**
 *
 * @author Benjamin Haedt
 */
public class InheritanceOutlab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intInput;
        String question;
        char exitQuestion;
        char response;
        char editResponse;
        int whileLoop = 0;
        int switchLoop;
        int id;
        String stringInput;
        String first;
        String last;
        int wage;
        int hours;
        Scanner console = new Scanner(System.in);
        //HourlyEmp hourlyEmp = new HourlyEmp();
        CommissionBase commissionEmp = new CommissionBase();
        while (whileLoop != 7){
            System.out.println("-----------------------------Main Menu-----------------------------\n");
            System.out.println("1 to create a new hourly employee");
            System.out.println("2 to create a new commision employee");
            System.out.println("3 to see the list of current employees and their information");
            System.out.println("4 to select which employee you want to see information, edit their information, or delete them");
            System.out.println("5 to show sales information");
            System.out.println("6 to exit");
            System.out.println("----------------------------------");
            whileLoop = console.nextInt();
            switch (whileLoop) {
                case 1:{
                    System.out.println("New Hourly Employee");
                    System.out.println("---------------------");
                    System.out.println("Enter the ID Number for this employee");
                    id= console.nextInt();
                   // hourlyEmp.setID(intInput);
                    System.out.println("Enter the First name for this employee");
                    first = console.next();
                   // hourlyEmp.setFirst(stringInput);
                    System.out.println("Enter the Last name for this employee");
                    last = console.next();
                    //hourlyEmp.setLast(stringInput);
                    System.out.println("Enter the wage for this employee");
                    wage = console.nextInt();
                    //hourlyEmp.setWage(intInput);
                    System.out.println("Enter the hours worked for this employee");
                    hours = console.nextInt();
                    //hourlyEmp.sethoursWorked(intInput);
                    HourlyEmp hourlyEmp = new HourlyEmp(id, first, last, wage, hours);
                    System.out.println("Employee: "+ hourlyEmp.last + "," + hourlyEmp.first + " Created");  
                break;
                }
                case 2:{
                    System.out.println("New Commission Employee");
                    System.out.println("---------------------");
                    //String newEmp = console.nextLine();   
                    System.out.println("Enter the ID Number for this employee");
                    intInput= console.nextInt();
                    //HourlyEmp hourlyEmp = new HourlyEmployee(intInput);
                    commissionEmp.setID(intInput);
                    System.out.println("Enter the First name for this employee");
                    stringInput = console.next();
                    commissionEmp.setFirst(stringInput);
                    System.out.println("Enter the Last name for this employee");
                    stringInput = console.next();
                    commissionEmp.setLast(stringInput);
                    System.out.println("Enter the base salary for this employee");
                    intInput = console.nextInt();
                    commissionEmp.setWage(intInput);
                    System.out.println("Enter the commission rate for this employee");
                    intInput = console.nextInt();
                    commissionEmp.setCommissionRate(intInput);
                    System.out.println("Enter the gross sales for this employee");
                    intInput = console.nextInt();
                    commissionEmp.setGrossSales(intInput);
                    System.out.println("Employee: "+ commissionEmp.last + ", " + commissionEmp.first + " Created");  
                    break;
                }
                case 3:{
                    System.out.println("---------------------");
                    System.out.println("Current Employees");
                    System.out.println("---------------------");
                    if(hourlyEmp.idNumber != 0){
                        System.out.println("Hourly Employees:");
                        System.out.println("---------------------");
                        System.out.println("Name: " + hourlyEmp.last + ", " + hourlyEmp.first);
                        System.out.println("ID Number: " + hourlyEmp.idNumber);
                        System.out.println("Wage: " + hourlyEmp.wage);
                        System.out.println("Hours Worked: "+ hourlyEmp.hoursWorked);
                        System.out.println("---------------------");
                    }
                    if(commissionEmp.idNumber != 0){
                        System.out.println("Commission Employees:");
                        System.out.println("---------------------");
                        System.out.println("Name: " + commissionEmp.last + ", " + commissionEmp.first);
                        System.out.println("ID Number: " + commissionEmp.idNumber);
                        System.out.println("Salary: " + commissionEmp.baseWage);
                        System.out.println("Commission Rate: "+ commissionEmp.commissionRate); 
                        System.out.println("Gross Sales: "+ commissionEmp.grossSales);
                        System.out.println("---------------------");
                    }
                    if(commissionEmp.idNumber == 0 && hourlyEmp.idNumber == 0){
                    System.out.println("No Employees Currently Exist.");
                    System.out.println("---------------------");
                    break;
                    }
                    System.out.println("---------------------");
                    System.out.println("Would you like to edit employee information?");
                    System.out.println("Enter yes or no");
                    question = console.next();
                    response = question.toLowerCase().charAt(0);
                    if (response == 'y'){
                        while (response == 'y'){
                            editResponse = 'y';
                            //System.out.println("---------------------");
                            //System.out.println("Enter the employee ID of the employee you want to edit");
                            //stringInput = console.next();
                            System.out.println("---------------------");
                            System.out.println("Enter 1 to edit hourly employee and 2 to edit commission employee or 3 to exit editing information");
                            switchLoop = console.nextInt();
                            if (switchLoop == 3){
                                break;
                            }
                            switch(switchLoop){ 
                                case 1:
                                    while (editResponse == 'y'){
                                    System.out.println("---------------------");
                                    System.out.println("What do you want to edit of " + hourlyEmp.last + "," + hourlyEmp.first);
                                    System.out.println("Enter 1 to change the first name");
                                    System.out.println("Enter 2 to change the last name");
                                    System.out.println("Enter 3 to change the wage");
                                    System.out.println("Enter 4 to edit hours worked");
                                    intInput = console.nextInt();
                                    if(intInput == 1){
                                        System.out.println("Enter new name: ");
                                        stringInput = console.next();
                                        hourlyEmp.setFirst(stringInput);
                                        System.out.println("Name Changed to: " + hourlyEmp.first);
                                    }
                                    if(intInput == 2){
                                        System.out.println("Enter new last: ");
                                        stringInput = console.next();
                                        hourlyEmp.setLast(stringInput);
                                        System.out.println("Name Changed to: " + hourlyEmp.last);
                                    }
                                    if(intInput == 3){
                                        System.out.println("Enter new wage: ");
                                        intInput = console.nextInt();
                                        hourlyEmp.setWage(intInput);
                                        System.out.println("Wage Changed to: " + hourlyEmp.wage);
                                    }
                                    if(intInput == 4){
                                        System.out.println("Enter new hours worked: ");
                                        intInput = console.nextInt();
                                        hourlyEmp.sethoursWorked(intInput);
                                        System.out.println("Hours Changed to: " + hourlyEmp.hoursWorked);
                                    }
                                    System.out.println("Would you like to edit anything else?");
                                    System.out.println("Enter yes or no");
                                    question = console.next();
                                    editResponse = question.toLowerCase().charAt(0);
                                    if (editResponse == 'n'){
                                        break;
                                    }
                                    }
                                case 2:
                                    while (editResponse == 'y'){
                                    System.out.println("---------------------");
                                    System.out.println("What do you want to edit of " + commissionEmp.last + "," + commissionEmp.first);
                                    System.out.println("Enter 1 to change the first name");
                                    System.out.println("Enter 2 to change the last name");
                                    System.out.println("Enter 3 to change the salary");
                                    System.out.println("Enter 4 to edit commission rate");
                                    System.out.println("Enter 5 to edit gross sales");
                                    intInput = console.nextInt();
                                    if(intInput == 1){
                                        System.out.println("Enter new name: ");
                                        stringInput = console.next();
                                        commissionEmp.setFirst(stringInput);
                                        System.out.println("Name Changed to: " + commissionEmp.first);
                                    }
                                    if(intInput == 2){
                                        System.out.println("Enter new last: ");
                                        stringInput = console.next();
                                        commissionEmp.setLast(stringInput);
                                        System.out.println("Name Changed to: " + commissionEmp.last);
                                    }
                                    if(intInput == 3){
                                        System.out.println("Enter new salary: ");
                                        intInput = console.nextInt();
                                        commissionEmp.setWage(intInput);
                                        System.out.println("Salary Changed to: " + commissionEmp.baseWage);
                                    }
                                    if(intInput == 4){
                                        System.out.println("Enter new commission rate: ");
                                        intInput = console.nextInt();
                                        commissionEmp.setCommissionRate(intInput);
                                        System.out.println("Commission Rate changed to: " + commissionEmp.commissionRate);
                                    }
                                    if(intInput == 5){
                                        System.out.println("Enter new gross sales: ");
                                        intInput = console.nextInt();
                                        commissionEmp.setGrossSales(intInput);
                                        System.out.println("Commission Rate changed to: " + commissionEmp.grossSales);
                                    }
                                    System.out.println("Would you like to edit anything else?");
                                    System.out.println("Enter yes or no");
                                    question = console.next();
                                    editResponse = question.toLowerCase().charAt(0);
                                    if (editResponse == 'n'){
                                        break;
                                    }
                                    }   
                        }
                    }    
                    }
                    break;
                }
                case 4:{
                    System.out.println("Enter the ID of the employee to view data or delete.");
                    System.out.println("-----------------------------------------------------");
                    intInput = console.nextInt();
                    break;
                }
                case 5:{
                    int salesMenu = 0;
                    while(salesMenu != 4){
                            System.out.println("1 to show total sales data");
                            System.out.println("2 to show total wages of all employees");
                            System.out.println("3 to show total revenue");
                            System.out.println("4 to exit sales information");
                            salesMenu = console.nextInt();
                            if(salesMenu == 1){
                                int totalSales;
                                System.out.println();
                            }
                            if(salesMenu == 2){
                                int totalCost = hourlyEmp.wage + commissionEmp.baseWage;
                                System.out.println("Total wages of all employees: " + totalCost);
                            }
                    }
                     break; 
                }
                 case 6:{
                    System.out.println("Are you sure you want to exit?");
                    System.out.println("Yes to exit, No to go back to the main menu");
                    question = console.next();
                    exitQuestion = question.toLowerCase().charAt(0);
                    if (exitQuestion == 'y'){
                        whileLoop = 7;
                    }
                     break; 
                }
                }               
        }
    } 
}
