// Clarisa Kelly
// Prompts user to enter 5, nonnegative integers, and reloops if invalid input is entered

import java.util.Scanner;

public class GetIntegers{
    public static void main(String[] args) {
    
    int counter = 0;
    Scanner myScanner = new Scanner(System.in);
    int sum = 0;
    System.out.println("Please enter 5 nonnegative integers: ");

    while (counter < 5 && myScanner.hasNextInt()){
        int num = myScanner.nextInt();
        if(num>=0){
            sum += num;
             counter++;
        }else
            System.out.println("Invalid input, enter again");
        }
        System.out.println("The sum is "+sum);
    }
  }
