package array;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Value to remove: " + val);

        int newLength = removeElement(nums, val);

        System.out.print("Array after removal: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("New length: " + newLength);
    }
}
