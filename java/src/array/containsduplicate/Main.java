package array.containsduplicate;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        Solution solution = new Solution();
        boolean isContains = solution.containsDuplicate(nums);
        System.out.println(isContains);
    }
}
