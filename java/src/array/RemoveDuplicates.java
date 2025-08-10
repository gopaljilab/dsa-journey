package array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        printTestCase(new int[] {1, 1, 2, 3, 3});
        printTestCase(new int[] {1, 2, 3, 4, 5});
        printTestCase(new int[] {7, 7, 7, 7});
        printTestCase(new int[] {4, 4});
        printTestCase(new int[] {4, 5});
        printTestCase(new int[] {10});
        printTestCase(new int[] {});
        printTestCase(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5});
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // first element is always unique
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[k] = nums[j];
                k++;
            }
        }
        return k; // number of unique elements
    }

    public static void printTestCase(int[] nums) {
        System.out.println("Input  : " + Arrays.toString(nums));

        int k = removeDuplicates(nums); // Call your implementation

        System.out.print("Output : [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Unique count: " + k);
        System.out.println("----------------------");

    }

}
