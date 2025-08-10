package array;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        printTestCase(new int[] {1, 2, 3, 4, 5});
        printTestCase(new int[] {7, 7, 7, 7});
        printTestCase(new int[] {4, 4});
        printTestCase(new int[] {10});
        printTestCase(new int[] {});
        printTestCase(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5});
    }

    public static int[] printTestCase(int[] nums){
        System.out.println("Input  : " + Arrays.toString(nums));
        int[] k = runningSum(nums); // Call your implementation
        System.out.println("Output : "+ Arrays.toString(k));
        System.out.println("-------------------------------------------------");
        return nums;
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }


}
