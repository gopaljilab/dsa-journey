package array.smallernumbersthancurrent;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println("Input: nums = " + Arrays.toString(nums));
        SmallerNumbersThanCurrentSol sol = new SmallerNumbersThanCurrentSol();
        int[] result = sol.smallerNumbersThanCurrent(nums);
        System.out.println("Output: " + Arrays.toString(result));

        Arrays.sort(nums);
        System.out.println("After sort : " + Arrays.toString(nums));
    }
}
