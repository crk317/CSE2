// Clarisa Kelly
// Homework #3 Program 1
// Feb 10th, 2015
// Asks for user input of counts and seconds
// Returns values of distance in miles, time in minutes, and avg mph of trip

import java.util.Scanner;

public class Bicycle {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
    
        // Ask user for number of seconds and store in variable nSeconds
        System.out.print("Enter the number of seconds: ");
        int nSeconds = myScanner.nextInt();
        
        // Ask user for number of counts and store in variable nCounts
        System.out.print("Enter the number of counts: ");
        int nCounts = myScanner.nextInt();
        
        // Establish varibles needed for calculations
        double wheelDiameter = 27.0, // diameter of bicycle wheel
        PI = 3.14159, // value of pi
        feetPerMile = 5280, // number of feet in 1 mile
        inchesPerFoot = 12, // numnber of inches in 1 foot
        secondsPerMinute = 60; // number of seconds in one minute
        
        double time = nSeconds/secondsPerMinute;
        double distanceTraveledInches = nCounts*PI*wheelDiameter;
        double distanceTraveledMiles = distanceTraveledInches/(inchesPerFoot*feetPerMile);
        double hours = time/60;
        double mph = distanceTraveledMiles/hours;
        
        System.out.println("The distance was "+distanceTraveledMiles+" miles and it took "+time+" minutes.");
        System.out.println("The average mph was "+mph);
        
    }
}
        
        
        