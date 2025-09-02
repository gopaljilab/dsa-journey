package array.findWordsContaining;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"leet", "code"};
        char x = 'e';
        System.out.println("Words = " + Arrays.toString(words) + "    " +"x = "+ x);
        List<Integer> resultList = solution.findWordsContaining(words,x);
        System.out.println(resultList);
    }
}
