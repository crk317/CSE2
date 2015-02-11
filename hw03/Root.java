// Clarisa Kelly
// Homework #3 Program 2
// Feb 10th, 2015
// Program asks user for a number and guesses cubed root and cube of number

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        //Prompt the user for input
        System.out.print("Enter a double and I print its cubed root: ");
        double x = myScanner.nextInt();
        
        double guess1 = x/3;
        double guess2 = (guess1*guess1*guess1+x)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
        
        double cubed = guess5*guess5*guess5;
        
        System.out.println("The cubed root is "+guess5);
        System.out.println("Guess cubed "+cubed);
        
    }
}