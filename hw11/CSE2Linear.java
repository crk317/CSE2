//Clarisa Kelly 
// HW#11
// User enters 15 ints into an array in numerical order that represent CSE2 grades
// Prompts user to search for a grade, says if it was found, then scrambles array

import java.util.Scanner;
import java.util.Arrays; 
import java.util.Random;

public class CSE2Linear {
    public static void main(String[] args) {
        try{
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        

            int [] grades;
            grades = new int[15];
            System.out.print("Enter 15 integer grades in numerical order: ");
            
            int i = 0;
            for(i = 0; i < 15; i++){
	            grades[i] = myScanner.nextInt();
	            if (grades[i]<0 || grades[i]>100){
	                System.out.println("Sorry, all grades must be from 0 to 100");
	                System.exit(0);
	            }else{
            }
            }for (int j = 0; j < grades.length - 1; j++) {
                if (grades[j] > grades[j+1]) {
                    System.out.println("Sorry, grades must be entered in ascending order");
                    System.exit(0);
                }else{
            }
            }
         System.out.println("The grades, sorted, are: "+Arrays.toString(grades));
         System.out.print("Enter a grade to search for: ");
         int firstSearch = myScanner.nextInt();
         binarySearch(grades,1,15,firstSearch);
         
        shuffleArray(grades);
        System.out.print("Scrambled: ");
        for (int k = 0; k < grades.length; k++)
        {
        System.out.print(grades[k] + " ");
        }
        System.out.println();
        
        System.out.print("Enter a grade to search for: ");
        int search = myScanner.nextInt();
	    int c;
 
        for (c = 0; c < grades.length; c++){
        if (grades[c] == search){
         System.out.println("The number " +search+ " was found in the list with " + (c + 1)+" iterations");
         break;
        }
        }if (c == grades.length){ 
        System.out.println("The number "+search+" was not found in the list with "+c+" iterations");
        }
        }catch(RuntimeException e){
            System.out.println("Sorry, all grades must be entered as an integer");
        }
    }
    public static void binarySearch(int[ ] array, int lowerbound, int upperbound, int key){
       int position;
       int comparisonCount = 1;    // counting the number of comparisons (optional)

     // To start, find the subscript of the middle position.
     position = ( lowerbound + upperbound) / 2;

     while((array[position] != key) && (lowerbound <= upperbound)){
         comparisonCount++;
         if (array[position] > key){                                             
              upperbound = position - 1;   
         }                                                             
              else{                                                        
              lowerbound = position + 1;    
        }
       position = (lowerbound + upperbound) / 2;
     }
     if (lowerbound <= upperbound){
           System.out.println("The number "+key+" was found in the list with "+comparisonCount+" iterations");
     }
     else{
          System.out.println("The number "+key+" was not found in the list with "+comparisonCount+ " iterations");
  }

} 
    public static void shuffleArray(int[] ar){
    Random rnd = new Random();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
}
