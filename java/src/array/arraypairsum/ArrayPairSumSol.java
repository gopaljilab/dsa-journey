package array.arraypairsum;

import java.util.Arrays;

public class ArrayPairSumSol {
    public int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        int i = nums.length-1;
        while (i > 0){
            sum += Math.min(nums[i], nums[i-1]);
            i-=2;
        }
        return sum;
    }
}
