package array.numberOfGoodPairs;

public class NoOfGoodPairs {
    public int noOfGoodPairs(int[] nums){
        int numsLength = nums.length;
        int countPairs = 0;

        for (int i = 0; i < numsLength-1; i++) {
            for (int j = i + 1; j < numsLength; j++) {
                if (nums[i] == nums[j]){
                    countPairs += 1;
                }
            }
        }
        return countPairs;
    }
}
