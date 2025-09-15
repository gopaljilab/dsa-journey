package array.thirdMax;

public class ThirdMaxSol {
    public int thirdMax(int[] nums){
        int size = nums.length;

        if (size == 1) {
            return nums[0];
        }
        if (size == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {

            if (nums[i] == firstMax || nums[i] == secondMax || nums[i] == thirdMax) {
                continue;
            }
            if (nums[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            }else if(nums[i] > secondMax){
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if (nums[i] > thirdMax) {
                thirdMax = nums[i];
            }
        }

        if (thirdMax == Integer.MIN_VALUE || secondMax == Integer.MIN_VALUE) {
            return firstMax;
        }

        return thirdMax;
    }
}
