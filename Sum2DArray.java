/*
------------- EXPLANATION --------------
Problem : Find the sum of 2 matrices
Approach :
1. Input two 2D arrays from the user
2. Make a temporary 2D array with same number of rows and columns as the 2 arrays, to store the resultant sum of 2 matrices
3. Make a nested loop and iterate over all elements of the temporary 2D array
4. Add integers of the two matrix and store in the temporary matrix
5. Print the temporary matrix
Time Complexity : O(n^2)
Space Complexity : O(1)
*/


import java.util.Scanner;

public class Sum2DArray {
    private static Scanner scanner = new Scanner(System.in);
    private static int whichArray =1;

    public static void main(String[] args) {

        //get number of rows and columns from user
        int row,column;
        System.out.println("Enter number of row:");
        row = scanner.nextInt();
        System.out.println("Enter number of column:");
        column = scanner.nextInt();

        //call function to take 2D array
        int[][] array1 = takeArrayInput(row,column);
        int[][] array2 = takeArrayInput(row,column);

        //callfunction to perform addition on arrays
        int[][] sumOfArray = addTwoArray(row, column, array1, array2); 

        //print sum of those arrays
        printSumOfArray(row, column, sumOfArray);
       
        
    }

    //take input of arrays
    private static int[][] takeArrayInput(int row, int column) {

        final int A[][] = new int[10][10];

        System.out.println("Enter elemets of array" +whichArray+ ":");
        for (int i = 0; i < row; i++) {
           for(int j=0; j<column; j++){
            A[i][j] = scanner.nextInt();
           }
        }
        whichArray++;
        return A;
    }

    private static int[][] addTwoArray(int row, int column, int[][] A, int[][] B) {
        int[][] c = new int[10][10];

        //perform addition
        for(int i =0; i<row; i++){
            for(int j=0; j<column; j++){
                c[i][j] += A[i][j]+B[i][j];
            }
        }

        //return sum of both arrays  
        return c;
      }

      private static void printSumOfArray(int row, int column, int[][] array){
        System.out.println("Sum of those arrays:");

        for(int i =0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("\n");

        }  
      }
}