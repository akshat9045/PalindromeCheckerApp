import java.util.Stack;

/**
 * ==========================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ==========================================================
 * * Use Case 5: Stack Based Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 * * This maps stack behavior to reversal logic.
 * * @author Developer
 * @version 5.0
 */
public class PalindromeCheckerApp {


    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        // As characters are pushed, the first char goes to the bottom
        // and the last char stays at the top.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string and compare with popped characters.
        // popping from the stack returns characters in reverse order.
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}