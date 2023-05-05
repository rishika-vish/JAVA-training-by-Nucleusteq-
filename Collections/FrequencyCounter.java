import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = scanner.nextLine();
        
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                frequency.put(c, frequency.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Frequency:");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
