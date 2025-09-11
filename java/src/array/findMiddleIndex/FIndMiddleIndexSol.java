package array.findMiddleIndex;

public class FIndMiddleIndexSol {
    public int findMiddleIndex(int[] nums) {
        int size = nums.length;
        int middleIndex = 0;
        int rightSum;
        int leftSum;
        if (size <= 2) {
            return -1;
        }

        for (int i = 0; i < size; i++) {
            middleIndex = i;
            rightSum = 0;
            leftSum = 0;
            if(size == 1){
                return 0;
            }

            if (size < 1) {
                return -1;
            }

            for(int j = 0; j < middleIndex; j++){
                leftSum += nums[j];
            }

            for(int k = middleIndex + 1; k < size; k++){
                rightSum += nums[k];
            }
            if(leftSum == rightSum){
                return middleIndex;
            }
        }
        return -1;
    }
}
