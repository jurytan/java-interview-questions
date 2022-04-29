public class Palindrome {
    public static void main(String[] args) {
        String possiblePalindrome = "rAceCar";
        int front = 0;
        int back = possiblePalindrome.length() - 1;

        while (front < back) {
            // ignore the whitespace
            while (!Character.isLetterOrDigit(possiblePalindrome.charAt(front))) {
                front++;
            }
            while (!Character.isLetterOrDigit(possiblePalindrome.charAt(back))) {
                back--;
            }
            // you can also do this too
            // possiblePalindrome = possiblePalindrome.replaceAll("\\s", "");

            // do the check on the two ends
            if (Character.toLowerCase(possiblePalindrome.charAt(front)) != Character.toLowerCase(possiblePalindrome.charAt(back))) {
                // return false
                System.out.println("Not a palindrome");
                return;
            }

            // final action - increment/decrement the indices
            front++;
            back--;
        }
        System.out.println("Is a palindrome");

    }
}