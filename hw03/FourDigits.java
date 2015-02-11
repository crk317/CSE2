// Clarisa Kelly
// Homework #3 Program 3
// Feb 10, 2015
// Program asks for a number and returns the four digits to the right of the decimal

import java.util.Scanner;

public class FourDigits {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        //Prompt the user for input
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
        double number = myScanner.nextDouble();
        
        int tens,hundreds,thousands,tenThousands;
        
        tens=(int)(number*10)%10;
        hundreds=(int)(number*100)%10;
        thousands=(int)(number*1000)%10;
        tenThousands=(int)(number*10000)%10;
        
        System.out.println("The four digits are "+tens+hundreds+thousands+tenThousands);
    }
}
