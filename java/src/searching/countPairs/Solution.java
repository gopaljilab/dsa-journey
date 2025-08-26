package searching.countPairs;

import java.util.Collections;
import java.util.List;

public class Solution {
    public static int calculateCountPairs(List<Integer> nums, int target){
        int countPairs = 0;
        int sizeOfList = nums.size();

        // Brute Force
/**        for (int i = 0; i<sizeOfList; i++){
//            for (int j = i+1; j<sizeOfList; j++){
//                if (nums.get(i) + nums.get(j) < target){
//                    countPairs++;
//                }
//            }
        }*/

        Collections.sort(nums);
        int left = 0;
        int right = sizeOfList-1;
        while (left<=right){
            if((nums.get(left) + nums.get(right)) < target){
                countPairs += right-left;
                System.out.println(right + " " + left);
                left++;
            }else {
                right--;
            }
        }
        return countPairs;
    }
}
