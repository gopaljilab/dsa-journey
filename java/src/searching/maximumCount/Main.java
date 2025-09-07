package searching.maximumCount;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-3, -2, -1, 0, 0, 2, 4, 5, 6};
        System.out.println("Input : " + Arrays.toString(nums));
        MaximumCountSol sol = new MaximumCountSol();
        int result = sol.maximumCount(nums);
        System.out.println("Output : " + result);
    }
}
