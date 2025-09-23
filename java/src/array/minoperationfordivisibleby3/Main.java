package array.minoperationfordivisibleby3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println("Nums: " + Arrays.toString(nums));

        MinimumOperations minimumOperations = new MinimumOperations();
        int minOperations = minimumOperations.minimumOperations(nums);
        System.out.println("Output : " + minOperations);
    }
}
