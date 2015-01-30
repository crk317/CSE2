// Clarisa Kelly
// Lab 02, Cyclometer.java
// January 30th, 2015
// CSE 002 Section 110
// Given the time and rotation count for two trips, program prints:
// Number of minutes for each trip, number of counts for each trip,
// Distance of each trip, and combined distance of both trips

public class Cyclometer {
    public static void main(String[] args) {
        int secsTrip1 = 480; //time in seconds of Trip 1
        int secsTrip2 = 3220; //time in seconds of Trip 2
        int countsTrip1 = 1561; //rotation count of Trip 1
        int countsTrip2 = 9037; //rotation count of Trip 2
        
        double wheelDiameter = 27.0, // diameter of bicycle wheel
        PI = 3.14159, // value of pi
        feetPerMile = 5280, // number of feet in 1 mile
        inchesPerFoot = 12, // numnber of inches in 1 foot
        secondsPerMinute = 60; // number of seconds in one minute
        double distanceTrip1, distanceTrip2,totalDistance;
        
        // Print out # of minutes and rotation counts for each trip
        System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       	      
        distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
	    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    	totalDistance = distanceTrip1 + distanceTrip2;
        
        // Print out the distances
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");
    }
}