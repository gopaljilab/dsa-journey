package array;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("Input : " + Arrays.toString(nums));
        int[] ans = getConcatenation(nums);
        System.out.println("Output : " + Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int copyLength = nums.length;
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < copyLength; i++) {
            ans[i] = nums[i];
            ans[i + copyLength] = nums[i];
        }
        return ans;
    }
}
