package array.moveZeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println("Input : " + Arrays.toString(nums));
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        System.out.println("Output : " + Arrays.toString(nums));
    }
}
