// Clarisa Kelly
// Hw #4 Program #1
// Program prompts user to think of a number btwn 1 and 10 (inclusive)
// Then asks a series of questions to try and guess the number

import java.util.Scanner;

public class WhichNumber {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        //Prompt the user for input
        System.out.println("Think of a number between 1 and 10, inclusive.");
        
        System.out.print("Is the number even? ");
        String aString = myScanner.next();
        char even = aString.charAt(0);
        
        if((even=='y')||(even=='Y')){
            System.out.print("Is the number divisible by 3? ");
            String bString = myScanner.next();
            char yesthree = bString.charAt(0);
                if((yesthree=='y')||(yesthree=='Y')){
                    System.out.print("Is the number 6? ");
                    String cString = myScanner.next();
                    char six = cString.charAt(0);
                        if((six=='y')||(six=='Y')){
                            System.out.println("Yay!");
                        }else if ((six=='n')||(six=='N')){
                            System.out.println("This is not consistent");
                        }else 
                            System.out.println("This is not a valid input.");
                }else if((yesthree=='n')||(yesthree=='N')){
                    System.out.print("Is the number divisible by 4? ");
                    String dString = myScanner.next();
                    char divfour = dString.charAt(0);
                        if((divfour=='y')||(divfour=='Y')){
                            System.out.print("When the number is divided by four is the result greater than one? ");
                            String eString = myScanner.next();
                            char greaterone = eString.charAt(0);
                                if ((greaterone=='y')||(greaterone=='Y')){
                                    System.out.print("Is the number 8? ");
                                    String fString = myScanner.next();
                                    char eight = fString.charAt(0);
                                        if((eight=='y')||(eight=='Y')){
                                            System.out.println("Yay!");
                                        }else if ((eight=='n')||(eight=='N')){
                                            System.out.println("This is not consistent");
                                        }else {
                                            System.out.println("This is not a valid input.");
                                        }
                                }else if ((greaterone=='n')||(greaterone=='N')){
                                    System.out.print("Is the number 4? ");
                                    String gString = myScanner.next();
                                    char four = gString.charAt(0);
                                        if((four=='y')||(four=='Y')){
                                            System.out.println("Yay!");
                                        }else if ((four=='n')||(four=='N')){
                                            System.out.println("This is not consistent");
                                        }else {
                                            System.out.println("This is not a valid input.");
                                        }
                                }else{
                                    System.out.println("This is not a valid input.");
                                }
                        }else if((divfour=='n')||(divfour=='N')){
                            System.out.print("Is it divisible by 5? ");
                            String hString = myScanner.next();
                            char divfive = hString.charAt(0);
                                if((divfive=='y')||(divfour=='Y')){
                                    System.out.print("Is the number 10? ");
                                    String iString = myScanner.next();
                                    char ten = iString.charAt(0);
                                        if((ten=='y')||(ten=='Y')){
                                            System.out.println("Yay!");
                                        }else if ((ten=='n')||(ten=='N')){
                                            System.out.println("This is not consistent");
                                        }else {
                                            System.out.println("This is not a valid input.");
                                        }
                                }else if((divfive=='n')||(divfour=='N')){
                                    System.out.print("Is the number 2? ");
                                    String jString = myScanner.next();
                                    char two = jString.charAt(0);
                                        if((two=='y')||(two=='Y')){
                                            System.out.println("Yay!");
                                        }else if ((two=='n')||(two=='N')){
                                            System.out.println("This is not consistent");
                                        }else {
                                            System.out.println("This is not a valid input.");
                                        }
                                }else{
                                   System.out.println("This is not a valid input."); 
                                }
                        }else{
                            System.out.println("This is not a valid input.");
                        }
                }else{
                    System.out.println("This is not a valid input");}
        }else if((even=='n')||(even=='N')){
            System.out.print("Is the number divisible by 3? ");
            String kString = myScanner.next();
            char divthree = kString.charAt(0);
                if((divthree=='y')||(divthree=='Y')) {
                    System.out.print("When divided by 3, is the result greater than one? ");
                    String lString = myScanner.next();
                    char greaterthanone = lString.charAt(0);
                        if((greaterthanone=='y')||(greaterthanone=='Y')){
                            System.out.print("Is the number 9? ");
                            String nString = myScanner.next();
                            char nine = nString.charAt(0);
                                if((nine=='y')||(nine=='Y')){
                                    System.out.println("Yay!");
                                }else if ((nine=='n')||(nine=='N')){
                                    System.out.println("This is not consistent");
                                }else {
                                    System.out.println("This is not a valid input.");
                                }
                        }else if((greaterthanone=='n')||(greaterthanone=='N')){
                            System.out.print("Is the number 3? ");
                            String oString = myScanner.next();
                            char three = oString.charAt(0);
                                if((three=='y')||(three=='Y')){
                                    System.out.println("Yay!");
                                }else if ((three=='n')||(three=='N')){
                                    System.out.println("This is not consistent");
                                }else {
                                    System.out.println("This is not a valid input.");
                                }
                        }else{
                            System.out.println("This is not a valid input.");
                        }
                }else if((divthree=='n')||(divthree=='N')) {
                    System.out.print("Is the number greater than 6? ");
                    String mString = myScanner.next();
                    char greatersix = mString.charAt(0);
                        if((greatersix=='y')||(greatersix=='Y')) {
                            System.out.print("Is the number 7? ");
                            String pString = myScanner.next();
                            char seven = pString.charAt(0);
                                if((seven=='y')||(seven=='Y')){
                                    System.out.println("Yay!");
                                }else if ((seven=='n')||(seven=='N')){
                                    System.out.println("This is not consistent");
                                }else {
                                    System.out.println("This is not a valid input.");
                                }
                        }else if((greatersix=='n')||(greatersix=='N')) {
                            System.out.print("Is the number less than 3? ");
                            String qString = myScanner.next();
                            char lessthree = qString.charAt(0);
                                if((lessthree=='y')||(lessthree=='Y')){
                                    System.out.print("Is the number 1? ");
                                    String rString = myScanner.next();
                                    char one = rString.charAt(0);
                                        if((one=='y')||(one=='Y')){
                                            System.out.println("Yay!");
                                        }else if ((one=='n')||(one=='N')){
                                            System.out.println("This is not consistent");
                                        }else {
                                            System.out.println("This is not a valid input.");
                                        }
                                }else if((lessthree=='n')||(lessthree=='N')){
                                    System.out.print("Is the number 5? ");
                                    String sString = myScanner.next();
                                    char five = sString.charAt(0);
                                        if((five=='y')||(five=='Y')){
                                            System.out.println("Yay!");
                                        }else if ((five=='n')||(five=='N')){
                                            System.out.println("This is not consistent");
                                        }else {
                                            System.out.println("This is not a valid input.");
                                        }
                                }else {
                                    System.out.println("This is not a valid input.");
                                }
                                
                        }else{
                            System.out.println("This is not a valid input.");
                        }
                    
                }else {
                    System.out.println("This is not a valid input.");
                }
        }else {
            System.out.println("This is not a valid input");
        }
    }
}
            