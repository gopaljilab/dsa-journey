package array.maxfrequencyelements;

import java.util.Arrays;

public class MaximumFreqElementsMain {
    public static void main(String[] args) {
        int[] nums = {10,12,11,9,6,19,11};
        System.out.println(Arrays.toString(nums));
        MaximumFreqElementsSol sol = new MaximumFreqElementsSol();
        int result = sol.maxFrequencyElements(nums);
        System.out.println(result);
    }
}
