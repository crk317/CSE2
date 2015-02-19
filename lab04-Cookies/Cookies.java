// Clarisa Kelly
// lab #4
// Prompts user to input # of people and # of cookies that they are planning to buy
// Also asks how many cookies they want each person to get
// Returns whether or not there are enough cookies and if the amount will divide evenly

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        //Prompt the user for input
        System.out.print("Enter the number of People: ");
        int nPeople = myScanner.nextInt();
        
        if(myScanner.hasNextInt())
            System.out.println("Yay you did it");
        else{
            System.out.println("You did not enter an int");
            return;    //leaves the program, i.e.
                      //the program terminates
}

}
}