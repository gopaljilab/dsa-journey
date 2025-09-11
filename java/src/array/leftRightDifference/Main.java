package array.leftRightDifference;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {8,28,35,21,13,21,72,35,52,74};
        System.out.println("Input : Nums = " + Arrays.toString(nums));
        LeftRightDiffSol sol = new LeftRightDiffSol();
        int[] newNums = sol.leftRightDifference(nums);
        System.out.println("Output : " + Arrays.toString(newNums));
    }
}
