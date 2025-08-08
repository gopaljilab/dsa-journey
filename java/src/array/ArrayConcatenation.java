package array;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] nums2 = {1,2,3,4,5};
        System.out.println("Input : " + Arrays.toString(nums));
        int[] ans = getConcatenation(nums);
        System.out.println("Output : " + Arrays.toString(ans));
        System.out.println();

        System.out.println("Input : " + Arrays.toString(nums2));
        int[] ans2 = getConcatenation(nums2);
        System.out.println("Output : " + Arrays.toString(ans2));
        System.out.println();
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
