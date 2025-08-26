package array.majorityElement;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {2,2,1,1,1,2,2};
        Solution sol = new Solution();
        int majorityElement = sol.majorityElement(numbers);
        System.out.println(majorityElement);
    }
}
