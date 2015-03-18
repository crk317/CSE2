// Clarisa Kelly
// Hw 07
// Program asks user for integer 1-30, then creates number wave using input

import java.util.Scanner;

public class Waves{
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter an integer between 1 and 30: ");
    int endData = myScanner.nextInt();
    
int row     =   0;
int cell    =   0;
int rowcell =   0;
int row2, cell2,rowcell2;


    if(endData>=1 && endData<=30){
        System.out.println("FOR LOOP: ");
        for (row = 1; row <= endData; row++) {
        
            if (row%2 == 0) {
                for (cell = 0; cell < row; cell++) {
                    for (rowcell = 0; rowcell <= cell; rowcell++) {
                        System.out.print(row);
                    }
                        System.out.println("");
                }
        
            }
        
             else {
        
                for (cell = row; cell > 0; cell--) {
                    for (rowcell = cell; rowcell > 0; rowcell--) {
                        System.out.print(row);  
                    }
                        System.out.println("");
                }
        
            }
        
        }
        System.out.println("");
        System.out.println("WHILE LOOP: ");
        row2 = 1;
     
        while (row2 <= endData){
            
            if(row2%2 == 0){
                cell2=0;
                while(cell2<row2){
                    rowcell2 = 0;
                    cell2++;
                    while(rowcell2 <= cell2){
                        rowcell2++;
                        System.out.print(row2);
                    } System.out.println("");
            }
        
        }else {
            cell2=row2;
            rowcell2 = cell2;
            while(cell2 > 0){
                cell2--;
            }while (rowcell2>0){
                System.out.print(row2);
                rowcell2--;
            }System.out.println("");
        } row2++;
        }
        
    }else{
        System.out.println("Sorry, you must input an integer between 1 and 30");
    }

}
}