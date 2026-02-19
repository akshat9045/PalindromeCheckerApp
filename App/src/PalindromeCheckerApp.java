/**
 * ==========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ==========================================================
 * * Use Case 2: Hardcoded Palindrome Validation
 * * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 * * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 * * @author Developer
 * @version 2.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to be checked
        String input = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character at index i with character at the corresponding end index
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Conditional Statement (if-else) to evaluate and print the result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}