/*
------------- EXPLANATION --------------
Problem : Find the sum of all the integers of an array
Approach :
1. Input an array from the user
2. Take a sum variable and initialize it to 0, to store the sum of integers in the array
3. Loop through all the integers of the array
4. Add sum to current integer and store the result in the sum variable, till loop finishes
5. Print the sum variable
Time Complexity : O(n)
Space Complexity : O(1)
*/


import java.util.Scanner;

class SumArrayElements{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(final String args[]) {
         //call a function to get size of array from user
         int size = inputArraySize();

        //call function to take user inputs 
        final int array[] = takeArrayInput(size);

        //call function to calculate sum
        sum(array);
    }

    private static int inputArraySize(){
        int size;
        System.out.println("Enter size of array:");
        size = scanner.nextInt();
        return size;
    }

    private static int[] takeArrayInput(int size) {
        final int array[] = new int[10];
        System.out.println("Enter elemets array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void sum(final int[] A) {
        int sum = 0;

        //calculate sum ofarray element
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }

        //print the sum of array's elements
        System.out.println(sum);
    }
}



