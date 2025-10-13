package sorting.countingsort;

public class CountingSort {

    public int[] countingSort(int[] nums) {
        // Base condition
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        // Find maximum value
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        // Create and fill frequency array
        int[] countArray = new int[max + 1];
        for (int num : nums) {
            countArray[num]++;
        }

        // Rebuild the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                nums[index++] = i;
                countArray[i]--;
            }
        }
        return nums;
    }
}
