import java.util.Scanner;

public class OddEvenSeperate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take input from user for array size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        int[] array = new int[size];
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        
        // Take input from user for array elements
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            if (array[i] % 2 == 0) {
                evenArray[evenCount++] = array[i];
            } else {
                oddArray[oddCount++] = array[i];
            }
        }
        
        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
        
        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
        input.close();
        
    }
    
}
