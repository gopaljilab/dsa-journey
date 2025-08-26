package array.findMaxConsecutiveOnes;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,0,1,1,1,1,0,0,0,1,1,1,};
        System.out.println("Input : " + Arrays.toString(nums));
        int resultCons = Solution.maxConsecutiveOnes(nums);
        System.out.println("Output : " + resultCons);
    }
}
