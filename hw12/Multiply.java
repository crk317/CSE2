// Clarisa Kelly
// Hw #12
// Program asks user for the dimensions of two matrices, generates two random
// matrices based on these values, and prints their product matrix

import java.util.Scanner;
import java.util.Arrays; 
import java.util.Random;
import java.util.*;

public class Multiply {
    public static void main(String[] args) {
    int mOne = 0;
    int mTwo = 0;
    int nOne = 0;
    int nTwo = 0;
       
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    try{
    do{
    System.out.print("Enter the number of rows in Matrix #1: ");
    mOne = myScanner.nextInt();
    System.out.print("Enter the number of columns in Matrix #1: ");
    nOne = myScanner.nextInt();
    System.out.print("Enter the number of rows in Matrix #2: ");
    mTwo = myScanner.nextInt();
    System.out.print("Enter the number of columns in Matrix #2: ");
    nTwo = myScanner.nextInt();
    
    if(mOne<=0 || mTwo<=0 || nOne<=0 || nTwo<=0){
        System.out.println("Sorry, dimensions must be positive integers");
    }
    if(nOne!=mTwo){
        System.out.println("These matrices cannot be multiplied, please try again");
    }
    }while(nOne!=mTwo || mOne<=0 || mTwo<=0 || nOne<=0 || nTwo<=0);
    }catch (RuntimeException e){
        System.out.println("Sorry, only positive integers are acceptable input.");
        System.exit(0);
    }
    
    int [] [] matrixOne = randomMatrix(mOne,nOne);
    int [] [] matrixTwo = randomMatrix(mTwo,nTwo);
    
    System.out.println("First Random Matrix: "); //print 1st random matrix
    for(int c = 0; c < mOne; c++){
        for(int d = 0; d < nOne; d++){
            System.out.printf("%5d ", matrixOne[c][d]);
      }
            System.out.println();
    }
    
    System.out.println("");
    System.out.println("Second Random Matrix: "); //print 2nd random matrix
    for(int x = 0; x < mTwo; x++){
        for(int y = 0; y < nTwo; y++){
            System.out.printf("%5d ", matrixTwo[x][y]);
      }
            System.out.println();
    }
        int [] [] multipliedMatrix = matrixMultiply(matrixOne,matrixTwo); //print multiplied matrix
        System.out.println("Product of First and Second Matrix: ");
        for(int g = 0; g < mOne; g++){
        for(int h = 0; h < nTwo; h++){
            System.out.printf("%5d ", multipliedMatrix[g][h]);
      }
            System.out.println();
    }
        
         
} 
    public static int [] [] randomMatrix(int height, int width){ //creates random matrix
        Random random = new Random();

        int [][] array = new int[height][width];

        for( int i = 0 ; i < array.length ; i++ ) { 
           for ( int j = 0 ; j < array[i].length ; j++ ) { 
              array[i][j] = random.nextInt(21)-10;
           }
        }

     return array;
        
    }public static int[][] matrixMultiply(int[][] m1, int[][] m2) {
        int m1ColLength = m1[0].length; // m1 columns length
        int m2RowLength = m2.length;    // m2 rows length
        int mRRowLength = m1.length;    // m result rows length
        int mRColLength = m2[0].length; // m result columns length
        int[][] mResult = new int[mRRowLength][mRColLength];
        for(int s = 0; s < mRRowLength; s++) {         // rows from m1
            for(int t = 0; t < mRColLength; t++) {     // columns from m2
                for(int u = 0; u < m1ColLength; u++) { // columns from m1
                    mResult[s][t] += m1[s][u] * m2[u][t];
                }
            }
        }
        return mResult;
    }
}
