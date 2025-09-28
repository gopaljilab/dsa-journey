package array.minoperationfordivisibleby3;

public class MinimumOperations {
    public int minimumOperations(int[] nums) {
        /*int minOperations = 0;
        for (int i = 0; i < nums.length; i++) {
            int minOperationForAElement = 0;
            int operationsByDecreasing = 0;
            int operationsByIncreasing = 0;
            if (!(nums[i] % 3 == 0)) {
                int elementIncreasing = nums[i];
                while (!(elementIncreasing % 3 == 0)) {
                    elementIncreasing += 1;
                    operationsByIncreasing += 1;
                }

                int elementDecreasing = nums[i];
                while (elementDecreasing % 3 != 0) {
                    elementDecreasing -= 1;
                    operationsByDecreasing += 1;
                }
            }
            minOperationForAElement = Math.min(operationsByIncreasing, operationsByDecreasing);
            minOperations += minOperationForAElement;*/
        int countOps = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 3 == 0){
                continue;
            }else{
                countOps++;
            }
        }
        return countOps;
    }
}
