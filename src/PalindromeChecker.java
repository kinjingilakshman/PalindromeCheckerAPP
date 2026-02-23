public class PalindromeChecker {

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
}
