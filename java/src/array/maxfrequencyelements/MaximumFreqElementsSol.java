package array.maxfrequencyelements;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MaximumFreqElementsSol {
    public int maxFrequencyElements(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length == 1)
            return 1;

        // Find maximum value
        int max = nums[0];
        for (int num : nums)
            if (num > max)
                max = num;

        // Create and fill frequency array
        int[] countArray = new int[max+1];
        for (int num : nums){
            countArray[num]++;
        }

        int tempMaxFrequency = 0;
        int maxFrequency = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > tempMaxFrequency) {
                tempMaxFrequency = countArray[i];
            }
        }
        for (int i = 0; i < countArray.length; i++) {
            if (tempMaxFrequency == countArray[i]){
                maxFrequency += countArray[i];
            }
        }
        return maxFrequency;
    }
}
