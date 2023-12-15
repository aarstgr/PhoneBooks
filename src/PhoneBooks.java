import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBooks {
    private static Map<String, String> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 3) {
            System.out.println("Menu:");
            System.out.println("1. Add a number");
            System.out.println("2. Print all names and numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNumber(scanner);
                    break;
                case 2:
                    printPhoneBook();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again!");
            }
        }
    }
    private static void addNumber(Scanner scanner) {
        System.out.print("Enter the person's name: ");
        String name = scanner.next();
        System.out.print("Enter the Phone number: ");
        String number = scanner.next();
        phoneBook.put(name, number);
        System.out.println("Number added for " + name);
    }
    private static void printPhoneBook() {
        if (phoneBook.isEmpty()) {
            System.out.println("your Phone book is empty!");
        } else {
            System.out.println("Phone Book Entries:");
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + ", Number: " +  entry.getValue());
            }
        }
    }
}
