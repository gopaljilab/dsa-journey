package array;

import java.util.Arrays;

public class MinimumAverage {
    public static double minimumAverage(int[] nums){
        double[] avgs = new double[nums.length/2];
        double smallAvg = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        for (int i = 0; i < nums.length/2; i++) {
            avgs[i] = (double) (nums[start] + nums[end]) /2;
            start++;
            end--;
            if (smallAvg > avgs[i])
                smallAvg = avgs[i];
            if (start == end) break;
        }
        return smallAvg;
    }
}
