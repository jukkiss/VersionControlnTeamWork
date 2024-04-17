public class PalindromeChecker {
    //This code comes from Jukka-branch
    //This code is better to read and commented.
    // Main method that gets executed when the program runs
    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input a string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Transform the input by removing punctuation and converting to lower case
        String transformed = transformInput(input);

        // Check if the transformed string is a palindrome
        boolean isPalindrome = checkPalindrome(transformed);

        // Output the result based on the palindrome check
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    public static String transformInput(String input) {
        // Convert all characters in the string to lower case
        input = input.toLowerCase();

        // Remove specific punctuation characters
        input = input.replace(",", "");
        input = input.replace("!", "");

        return input;
    }

    public static boolean checkPalindrome(String input) {
        // Reverse the string
        String reversed = reverseString(input);

        // Check if the original string is equal to its reversed version
        return input.equals(reversed);
    }

    /**
     * Reverses the given string.
     * @param input String to be reversed.
     * @return Reversed string.
     */
    public static String reverseString(String input) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder reversed = new StringBuilder();

        // Append characters from the original string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Convert StringBuilder to String and return
        return reversed.toString();
    }
}
