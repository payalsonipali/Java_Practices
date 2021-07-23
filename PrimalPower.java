/*
------------- EXPLANATION --------------
Problem : Find the primal power of an array
Approach :
1. Input an array from the user
2. Take a counter and initialize it to 0, to count the number of prime numbers in the array
3. Loop through all the elements of the array
4. If the element is prime, increase the counter
5. To find a number is prime or not, we iterate through 2 to n/2, and check if it is divisible by any one of the integers in range
6. Return the counter variable (Primal Power)
Time Complexity : O(n^2)
Space Complexity : O(n)
*/



import java.util.Scanner;
class PrimalPower {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(final String[] args) {
        
        //get size of array
        int size = inputArraySize();

        //take array input
        final int[] array = takeArrayInput(size);

        //get primal power
        printPrimalPower(size, array);

        }

        private static int inputArraySize(){
            int size;
            System.out.println("Enter size of array:");
            size = scanner.nextInt();
            return size;
     }

     private static int[] takeArrayInput(int size) {
        final int[] array = new int[10];
        System.out.print("enter element of array:\t");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //get primal power function
    private static void printPrimalPower(int size,int[] A) {
        int noOfPrime = 0;

        for (int j = 0; j < size; j++) {
            
           if(isPrime(A[j])){
              noOfPrime++;
           }
        }

        System.out.println("Primal Power :" +noOfPrime);

    }

    //check number is prime or not
    private static boolean isPrime(int num){

        if(num<2){

            return false;
        
        }else{

            if( num == 2 || num == 3 ){
                return true;
            }else{

                for( int i=2 ; i<=num/2 ; ++i){
                    if( num%i == 0 )
                        return false;
                }

            }

        }
        
        return true;

    }
}