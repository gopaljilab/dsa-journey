package array.getfinalstate;

public class GetFinalStateSol {
    public int[] finalState(int[] nums, int k, int multiplier){
        for (int i = 0; i < k; i++) {
            int minIndex = min(nums);
            int afterOperation = nums[minIndex] * multiplier;
            nums[minIndex] = afterOperation;
        }
        return nums;
    }
    private int min(int[] nums){
        int min = Integer.MAX_VALUE;
        int minValueIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
                minValueIndex = i;
            }
        }
        return minValueIndex;
    }

}
