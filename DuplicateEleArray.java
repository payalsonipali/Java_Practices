/*
------------- EXPLANATION --------------
Problem : Find the duplicate integer in an array
Approach :
1. Input an array from the user
2. Take a HashSet variable
3. Loop through all the elements of the array
4. Check if the element is already present in the set, then return this element as duplicate one.
5. Else add it to HashSet and continue with loop until all elements traversed
Time Complexity : O(n)
Space Complexity : O(1)
*/


import java.util.HashSet;
import java.util.Scanner;

class DuplicateEleArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        //call a function to get size of array from user
        int size = inputArraySize();

        //call a function to take array input
        int[] array = takeArrayInput(size);
        
        //call findDuplicates function to get duplicate
        int duplicateElements = findDuplicates(size,array);
        System.out.println(duplicateElements+" is duplicate element in array");
    }
    
    //get size of array
    private static int inputArraySize(){
        int size;
        System.out.println("Enter size of array:");
        size = scanner.nextInt();
        return size;
    }

    //take array input
    private static int[] takeArrayInput(int size) {
        final int array[] = new int[10];
        System.out.println("Enter elemets array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //check duplicates
    private static int findDuplicates(int size,int[] array) { 
    HashSet<Integer> set = new HashSet<>();
    for(int i=0 ; i<size; ++i){
        if(set.contains(array[i])){
            return array[i];
        }
        set.add(array[i]);
        }
    return 0;
    }
}