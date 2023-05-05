import java.util.Scanner;
public class Productofno {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter an integer: ");
        int n2 = input.nextInt();
      
        System.out.println("Result= " + n1*n2);

        // closing the scanner object
        input.close();
    }
    
}
