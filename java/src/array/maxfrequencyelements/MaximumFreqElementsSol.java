package array.maxfrequencyelements;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MaximumFreqElementsSol {
    public int maxFrequencyElements(int[] nums) {
       /* Arrays.sort(nums);
        int occ = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num == nums[i]){
                continue;
            }
            occ++;
        }
        return occ;*/

        Set<Integer> setInteger = new TreeSet<>();
        for (int num : nums) {
            boolean isInsert = setInteger.add(num);
            if (isInsert){
                System.out.println("yes");
            }
        }
        return setInteger.size();
    }
}
