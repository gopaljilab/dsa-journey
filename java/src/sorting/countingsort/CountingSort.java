package sorting;

import java.time.chrono.MinguoDate;

public class CountingSort {
    public void countingSort(int[] nums){
        int length = nums.length;
        if ((nums.length <= 0) || (nums == null)){
            return;
        }

        int max = nums[0];
        for(int num : nums){
            if (num > max){
                num = max;
            }
        }

        int[] countArray = new int[max+1];
        for(int num : nums){
            countArray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i]>0){
                nums[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }
}
