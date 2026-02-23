import java.util.Scanner;

public class MainApp {
    public static boolean isPalindrome(String input) {
         if (input == null) return false;
            String cleaned = input.replaceAll("\\s+", "").toLowerCase();
            int left = 0;
        int right = cleaned.length() - 1;
          while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
             }
               return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Palindrome Checker Application ===");
        while (true) {
            System.out.println("\nEnter text to check (type EXIT to quit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("EXIT")) {
                System.out.println("Exiting Application...");
                break;
                }
            if (input.trim().isEmpty()) {
                System.out.println("Invalid input. Please enter valid text.");
                continue;
                }

            boolean result = isPalindrome(input);

            if (result) {
                     System.out.println("Result: It is a PALINDROME.");
                } else {
                   System.out.println("Result: Not a palindrome.");
            }
             }
        scanner.close();
    }
}