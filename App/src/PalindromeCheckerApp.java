/**
 * ==========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ==========================================================
 * * Use Case 3: Reverse String Based Palindrome Check
 * * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 * * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * * This introduces transformation-based validation.
 * * @author Developer
 * @version 3.0
 */
public class PalindromeCheckerApp {


    public static void main(String[] args) {
        // String literal "madam" stored for testing
        String original = "madam";
        String reversed = "";

        // Loop (for loop) used to iterate backward through the string
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation (+) to build the reversed string
            reversed += original.charAt(i);
        }

        // Output results
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        // equals() Method used to compare the content of the Strings
        if (original.equals(reversed)) {
            System.out.println("Result: \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is not a palindrome.");
        }
    }
}