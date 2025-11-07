package string.reversedegree;


/**
 *
 * Given a string s, calculate its reverse degree.
 *
 * The reverse degree is calculated as follows:
 *
 * For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).
 * Sum these products for all characters in the string.
 * Return the reverse degree of s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc"
 *
 * Output: 148
 *
 * The reversed degree is 26 + 50 + 72 = 148.
 */

public class ReverseDegreeSol {
    public static int reverseDegree(String s) {
        int revDeg = 0;
        for(int i =0; i < s.length(); i++){
            int indexInRevAlphabet = 27-(s.charAt(i)-96);
            int stringIndex = i+1;
            revDeg += (indexInRevAlphabet * stringIndex);
        }
        System.out.println(((int)'0'));
        return revDeg;
    }
}
