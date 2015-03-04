// Clarisa Kelly
// HW06 program #2
// Program asks user to enter a number between 9 and 16 and keeps asking until
// an acceptable value is enters, and then displays factorial of value

import java.util.Scanner;

public class RunFactorial{
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a number between 9 and 16, inclusive: ");
    
    boolean counter = true;
    int c, fact = 1;
    
    while (counter==true){
       int num = myScanner.nextInt();
        
        if (num>=9 && num<=16){
            for ( c = 1 ; c <= num ; c++ )
            fact = fact*c;
            counter = false;
            System.out.println("Factorial of "+num+" is: "+fact);
        }else
            System.out.println("Invalid input, try again! ");
        }
        }
    }
