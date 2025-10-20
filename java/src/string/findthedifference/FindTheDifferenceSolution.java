package string.findthedifference;

import java.util.*;

public class FindTheDifferenceSolution {
    public char findTheDifference(String string1, String string2){

        int[] counts = new int[26]; // For lowercase English letters

        for (char c : string1.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : string2.toCharArray()) {
            counts[c - 'a']--;
            if (counts[c - 'a'] < 0) {
                return c; // This is the added character
            }
        }

        return ' ';
    }
}
