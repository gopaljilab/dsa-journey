package array.arraypairsum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println("" + Arrays.toString(nums));
        ArrayPairSumSol sol = new ArrayPairSumSol();
        int result = sol.arrayPairSum(nums);
        System.out.println(result);
    }
}
