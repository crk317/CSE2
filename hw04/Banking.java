// Clarisa Kelly
// Feb 17th 2015
// Homework #4 Program 2
// Program picks a random number in between 1,000 and 5,000 as the users bank account balance
// Asks user if they want to withdraw, deposit, or check balance
// Asks amount if withdrawing or depositing and then shows balance afterwards

import java.util.Scanner;
import java.util.Random;

public class Banking {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        Random randombalance = new Random();
        int startingbalance = randombalance.nextInt(5000 - 1000) + 1000;
        
        System.out.print("Withdraw money, Deposit Money, or View Balance? (type w,d, or b): ");
        String aString = myScanner.next();
        char action = aString.charAt(0);
        
        if((action=='w')||(action=='W')){
            System.out.println("Your starting balance is $"+startingbalance);
            System.out.print("How much money would you like to withraw? ");
            String bString = myScanner.next();
            double withdrawamount = bString.nextDouble();
                if((withdrawamount<=startingbalance)&(withdrawamount>0)){
                    double newbalance = startingbalance-withdrawamount;
                    System.out.println("Your remaining balance is $"+newbalance);
                }else if (withdrawamount>startingbalance){
                    System.out.println("You do not have enought money in your account.");
                }else{
                    System.out.println("This is not a valid input.");
                }
        }else if((action=='d')||(action=='D')){
            System.out.println("Your starting balance is $"+startingbalance);
            System.out.print("How much money would you like to deposit? ");
            String cString = myScanner.next();
            double depositamount = cString.nextDouble();
                if(depositamount>0){
                    double addedbalance = startingbalance+depositamount;
                    System.out.println("Your new balance is $"+addedbalance);
                }else{
                    System.out.println("This is not a valid input.");
                }
            
        }else if((action=='b')||(action=='B')){
            System.out.println("Your balance is $"+startingbalance);
        }else{
            System.out.println("This is not a valid input.");
        }
    }
}