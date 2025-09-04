package array.sortedSquares;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class SortedSquaresSol {
    public int[] sortedSquares(int[] nums){
        int numsLength = nums.length;
        int[] newNums = new int[numsLength];
        /*int square = 0;
        for (int i = 0; i < numsLength; i++) {
            square = nums[i] * nums[i];
            newNums[i] = square;
        }
        Arrays.sort(newNums);*/

        int left = 0;
        int right = numsLength - 1;
        for (int i = right; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right]) ){
                newNums[i] = nums[left] * nums[left];
                left++;
            }else {
                newNums[i] = nums[right] * nums[right];
                right--;
            }
        }
        return newNums;
    }
}
