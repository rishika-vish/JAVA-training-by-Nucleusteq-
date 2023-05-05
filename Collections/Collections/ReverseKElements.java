package Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseKElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            queue.offer(scanner.nextInt());
        }

        System.out.print("Enter the number of elements to reverse: ");
        int k = scanner.nextInt();
        
        for (int i = 0; i < k; i++) {
            queue.offer(queue.poll());
        }
        
        System.out.println("Reversed Queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}


