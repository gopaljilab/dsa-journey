package array.maximizeexpressionofthree;

import java.util.Arrays;

public class MaximizeExpressionOfThree {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1] + nums[nums.length-1] + nums[0];
    }
}
