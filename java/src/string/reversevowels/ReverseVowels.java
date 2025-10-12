package string.reversevowels;

import java.util.*;

public class ReverseVowels {
    public static String reverseVowels(String string){
        if (string == null || string.isEmpty()) {
            return string;
        }

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        // Strings are immutable, so convert to a mutable character array
        char[] chars = string.toCharArray();
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            // Move left pointer to find the next vowel
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }

            // Move right pointer to find the next vowel
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            // If pointers have not crossed, swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                // Move both pointers inward
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        String string = reverseVowels(s);
        System.out.println(string);
    }
}
