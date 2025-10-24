/**
 *
 *       3461. Check If Digits Are Equal in String After Operations I
 *
 * You are given a string s consisting of digits. Perform the following operation repeatedly until the string has exactly two digits:
 *
 * For each pair of consecutive digits in s, starting from the first digit, calculate a new digit as the sum of the two digits modulo 10.
 * Replace s with the sequence of newly calculated digits, maintaining the order in which they are computed.
 * Return true if the final two digits in s are the same; otherwise, return false.
 */

package string.hassamedigits;

public class HasSameDigits {
    public static boolean hasSameDigits(String s){
        while (s.length() > 3){
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 1; j < s.length(); j++) {
                int newNum = ((s.charAt(j - 1) - '0') + (s.charAt(j) - '0')) % 10;
                stringBuilder.append(newNum);
            }
            s = stringBuilder.toString();

            if (stringBuilder.length()==3)
                break;
        }

        int firstNum = ((s.charAt(0) - '0') + (s.charAt(1) - '0')) % 10;
        int second = ((s.charAt(1) - '0') + (s.charAt(2) - '0')) % 10;

        if (firstNum == second)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "3902";
        System.out.println("input: "+s);
        boolean isHasSameDigits = hasSameDigits(s);
        System.out.println("Output: " + isHasSameDigits);
    }
}
