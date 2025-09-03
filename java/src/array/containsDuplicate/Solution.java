package array.containsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    /** public boolean containsDuplicate(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}
