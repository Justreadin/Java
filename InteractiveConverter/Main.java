import java.util.Scanner;

public class Main {

    // Method to convert a number to a string and back to a number
    public static void numberToStringAndBack(int number) {
        // Convert number to string
        String numToStr = Integer.toString(number);
        System.out.println("Number to String: " + numToStr);

        // Convert string back to number
        int strToNum = Integer.parseInt(numToStr);
        System.out.println("String back to Number: " + strToNum);
    }

    // Method to reverse a string
    public static String reverseString(String inputString) {
        StringBuilder reversedStr = new StringBuilder(inputString);
        reversedStr.reverse();
        System.out.println("Reversed String: " + reversedStr);
        return reversedStr.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display menu options
            System.out.println("\nChoose an option:");
            System.out.println("1. Convert Number to String and back to Number");
            System.out.println("2. Reverse a String");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left by nextInt()

            switch (choice) {
                case 1:
                    // Perform number to string and back conversion
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    numberToStringAndBack(number);
                    break;

                case 2:
                    // Perform string reversal
                    System.out.print("Enter a string: ");
                    String inputString = scanner.nextLine();
                    reverseString(inputString);
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting program...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
