// Clarisa Kelly
// February 6, 2015
// Lab 03 - BigMac
// This program will ask for the # of Big Macs, the cost per Big Mac,
// the tax percent, and then will print the total cost of those Big Macs

import java.util.Scanner;

public class BigMac {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        //Prompt the user for input
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        
        System.out.print("Enter the cost per Big Mac as "+ "a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        
	    System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        
        taxRate/=100; //change entered percent into a decimal to calculate with
        double cost$;
        int dollars,   //whole dollar amount of cost 
        dimes, pennies; //for storing digits
         //to the right of the decimal point 
         //for the cost$ 
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        
        //get dimes amount, 
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+" Big Macs, at $"+bigMac$ +" per Big Mac, with a"+  
        " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
    }
}

        