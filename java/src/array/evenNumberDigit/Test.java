package array.evenNumberDigit;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int nums[] = {555,901,482,1771,23,12,46,987,43257,2,1,7890,2};
        System.out.println("Input : " + Arrays.toString(nums));
        Solution solution = new Solution();
        System.out.println("Output : " + solution.findNumbers(nums));
    }
}
