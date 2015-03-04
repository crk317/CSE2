// Clarisa Kelly
// HW 6 Program #3
// Program generates a random number, r, from 1 to 100
// If the number is even, an r number of *s are printed out
// If r is odd, an r number of &s are printed out

import java.util.Random;

public class MakeSymbols{
public static void main(String[] args) throws Exception {
    Random rand = new Random();

    int r = rand.nextInt(100) + 1; // nextInt excludes 100, so add 1
    System.out.println("Random number generated: "+r);

    // decide which char to print
    String character = ((r%2) == 0) ? "*" : "&";
    // print
    int i = r;
    System.out.print("The output pattern: ");
    while (i > 0) {
        System.out.print(character);
        i--;
    }
}
}
    