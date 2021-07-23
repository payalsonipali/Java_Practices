/*
------------- EXPLANATION --------------
Problem : Find Max integer from an array
Approach :
1. Input a sorted array from the user
2. As the array is already sorted, the last element of the array would be the maximum one
3. So, return the last element of the array
Time Complexity : O(n)
Space Complexity : O(1)
*/


import java.util.Scanner;

class MaxElementArray{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //get size of array
        int size = inputArraySize();

        //call function to take  input of array from user
        int[] array = takeInputArray(size);

        //call function to get maximum integer
        int max_element = maxInteger(size,array);

        System.out.println(max_element);
    }

    private static int inputArraySize(){
        int size;
        System.out.println("Enter size of array:");
        size = scanner.nextInt();
        return size;
    }

    private static int[] takeInputArray(int size) {
        final int array[] = new int[10];

        //array is sorted 
        System.out.println("Enter elemets of array in sorted order:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int maxInteger(int size,int[] array){
        // calculate maximum integer of sprted array
        int max = array[size-1];
        return max;
    }
}