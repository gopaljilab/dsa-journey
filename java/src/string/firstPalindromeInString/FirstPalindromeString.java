package string.firstPalindromeInString;

public class FirstPalindromeString {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder palindrome = new StringBuilder(word).reverse();
            if (palindrome.toString().equals(word)) {
                return word;
            }
        }
        return "";
    }
}
