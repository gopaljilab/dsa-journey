package array.majorityElement;

import java.util.Arrays;

public class Solution {
    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
