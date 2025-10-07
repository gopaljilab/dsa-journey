package string.reverseprefix;

import java.util.Arrays;

public class ReversePrefixSol {
    public String reversePrefix(String word, char ch){
        int chIndex = word.indexOf(ch);
        if (chIndex == -1) {
            System.out.println(word);
            return word;
        }

        char[] charsArray = word.toCharArray();

        System.out.println(Arrays.toString(charsArray));
        int left = 0;
        int right = chIndex;

        while (left < right) {

            char temp = charsArray[left];
            charsArray[left] = charsArray[right];
            charsArray[right] = temp;

            left++;
            right--;
        }
        String str = new String(charsArray);
        return str;
    }
}
