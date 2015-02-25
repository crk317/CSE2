// Clarisa Kelly
// Homework #5
// Program asks user for three numbers that represents the RGB values of a color
// Then converts from RGB to the equivalent Hexadecimal 6 digit value 

import java.util.Scanner;

public class ToHex {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        try{
            
        int red, green, blue;
        System.out.print("Please enter three numbers representing RGB values: ");
        red = myScanner.nextInt();
        green = myScanner.nextInt();
        blue = myScanner.nextInt();
        
        if(red>=0 && red<=255 && green>=0 && green<=255 && blue>=0 && blue<=255){
            int firsthexRed = (int)(red/16);
            int redremainder = red%16;
            int firsthexGreen = (int)(green/16);
            int greenremainder = green%16;
            int firsthexBlue = (int)(blue/16);
            int blueremainder = blue%16;
            String digitOne, digitTwo, digitThree, digitFour, digitFive, digitSix;
            
            if(firsthexRed>=0 && firsthexRed<=9){ //if statement for first hex character
                digitOne = Integer.toString(firsthexRed);
            }else if (firsthexRed==10){
                digitOne = "A";
            }else if (firsthexRed==11){
                digitOne = "B";
            }else if (firsthexRed==12){
                digitOne = "C";
            }else if (firsthexRed==13){
                digitOne = "D";
            }else if (firsthexRed==14){
                digitOne = "E";
            }else{
                digitOne = "F";
            }
            
            if(redremainder>=0 && redremainder<=9){ //if statement for second hex character
                digitTwo = Integer.toString(redremainder);
            }else if (redremainder==10){
                digitTwo = "A";
            }else if (redremainder==11){
                digitTwo = "B";
            }else if (redremainder==12){
                digitTwo = "C";
            }else if (redremainder==13){
                digitTwo = "D";
            }else if (redremainder==14){
                digitTwo = "E";
            }else{
                digitTwo = "F";
            }
            
            if(firsthexGreen>=0 && firsthexGreen<=9){ //if statement for third hex character
                digitThree = Integer.toString(firsthexGreen);
            }else if (firsthexGreen==10){
                digitThree = "A";
            }else if (firsthexGreen==11){
                digitThree = "B";
            }else if (firsthexGreen==12){
                digitThree = "C";
            }else if (firsthexGreen==13){
                digitThree = "D";
            }else if (firsthexGreen==14){
                digitThree = "E";
            }else{
                digitThree = "F";
            }
            
            if(greenremainder>=0 && greenremainder<=9){ //if statement for fourth hex character
                digitFour = Integer.toString(greenremainder);
            }else if (greenremainder==10){
                digitFour = "A";
            }else if (greenremainder==11){
                digitFour = "B";
            }else if (greenremainder==12){
                digitFour = "C";
            }else if (greenremainder==13){
                digitFour = "D";
            }else if (greenremainder==14){
                digitFour = "E";
            }else{
                digitFour = "F";
            }
            
            if(firsthexBlue>=0 && firsthexBlue<=9){ //if statement for fifth hex character
                digitFive = Integer.toString(firsthexBlue);
            }else if (firsthexBlue==10){
                digitFive = "A";
            }else if (firsthexBlue==11){
                digitFive = "B";
            }else if (firsthexBlue==12){
                digitFive = "C";
            }else if (firsthexBlue==13){
                digitFive = "D";
            }else if (firsthexBlue==14){
                digitFive = "E";
            }else{
                digitFive = "F";
            }
            
            if(blueremainder>=0 && blueremainder<=9){ //if statement for sixth hex character
                digitSix = Integer.toString(blueremainder);
            }else if (blueremainder==10){
                digitSix = "A";
            }else if (blueremainder==11){
                digitSix = "B";
            }else if (blueremainder==12){
                digitSix = "C";
            }else if (blueremainder==13){
                digitSix = "D";
            }else if (blueremainder==14){
                digitSix = "E";
            }else{
                digitSix = "F";
            }
            
            String hexadecimalform = digitOne+digitTwo+digitThree+digitFour+digitFive+digitSix;
            
            System.out.println("The decimal numbers R: "+red+", G: "+green+", B: "+blue+", is represented in hexadecimal as: "+hexadecimalform);
            
        }else{
            System.out.println("You did not enter integers between 0-255 (inclusive).");
        }
        
        }catch(RuntimeException ex){
            System.out.println("Sorry, your input must consist of integers.");
        }
        
    }
}