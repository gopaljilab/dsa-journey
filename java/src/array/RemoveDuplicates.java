package array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {10, 10, 11, 12, 12, 13, 14, 14, 14}; // Input array
        int k = removeDuplicates(nums); // Calls your implementation
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[k] = nums[j];
                k++;
            }
        }
        return k;
    }
}
