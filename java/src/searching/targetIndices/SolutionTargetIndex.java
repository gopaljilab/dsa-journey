package searching.targetIndices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTargetIndex {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> newNums = new ArrayList<>();
        Arrays.sort(nums);
        /*for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target ){
                newNums.add(i);
            }
        }*/

        int first = 0;
        int last = nums.length-1;
        while (first < last){
            int mid = (first + last)/2;
            if (nums[mid] == target){
                newNums.add(mid);
            }
            if (nums[mid] < target){
                first = mid + 1;
            }else {
                last = mid - 1;
            }
        }

        return newNums;
    }
}
