import java.util.Scanner;
public class arithmaticopn {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter an integer: ");
        int n2 = input.nextInt();
      
        System.out.println("Sum= " + n1+n2);
        System.out.println("Difference= " + (n1- n2));
        System.out.println("Product= " + n1*n2);
        System.out.println("Quotient= " + n1/n2);
        System.out.println("Remainder= " + n1%n2);

        // closing the scanner object
        input.close();}

    
}
