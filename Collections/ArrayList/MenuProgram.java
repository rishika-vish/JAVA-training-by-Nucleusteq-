package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuProgram<T> {
    
    private List<T> list;
    
    public MenuProgram() {
        this.list = new ArrayList<T>();
    }
    
    public void add(T element) {
        list.add(element);
        System.out.println("Element added: " + element);
    }
    
    public void remove(int index) {
        if (index >= 0 && index < list.size()) {
            T removed = list.remove(index);
            System.out.println("Element removed: " + removed);
        } else {
            System.out.println("Invalid index.");
        }
    }
    
    public void display() {
        System.out.println("Elements in the list: " + list);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuProgram<String> menu = new MenuProgram<String>();
        int choice = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    String addElement = scanner.nextLine();
                    menu.add(addElement);
                    break;
                case 2:
                    System.out.print("Enter the index of the element to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine();
                    menu.remove(removeIndex);
                    break;
                case 3:
                    menu.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println();
        } while (choice != 4);
        scanner.close();
    }

}

