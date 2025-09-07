package searching.maximumCount;

public class MaximumCountSol {
    // Optimised Binary Search

    public int maximumCount(int[] nums){
        int length = nums.length;

        int firstZero = lowerBound(nums, 0);
        int firstPositive = lowerBound(nums, 1);

        int negCount = firstZero;
        int posCount = length - firstPositive;

        return Math.max(negCount, posCount);
    }

    private int lowerBound(int[] nums, int target){
        int low = 0;
        int high = nums.length;

        while (low < high){
            int mid = (low + high) / 2;

            if (nums[mid] < target){
                low = mid + 1;
            }else {
                high = mid;
            }

        }
        return low;
    }


    /** Brute-Force
     *
     *  public int maximumCount(int[] nums){
        int countMax = 0;
        int countMin = 0;
        for (int num : nums) {
            if (num > 0) {
                countMax++;
            } else if (num == 0) {
                continue;
            } else {
                countMin++;
            }
        }
        return Math.max(countMax, countMin);
     */
}
