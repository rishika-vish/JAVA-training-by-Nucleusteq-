import java.util.Scanner;

public class PinNumbervalidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 6-digit pin number: ");
        String input = scanner.nextLine();
        
        if (input.length() != 6) {
            System.out.println("Invalid input: Pin number must be exactly 6 digits long.");
        } else {
            try {
                int pin = Integer.parseInt(input);
                System.out.println("Valid input: Pin number is " + pin);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Pin number must be a number.");
            }
        }
    }
    
}
