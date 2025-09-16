package array.pivotarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println("nums : " +Arrays.toString(nums)
                + " , pivot : " + pivot);

        PivotArraySol sol = new PivotArraySol();
        int[] result = sol.pivotArray(nums, pivot);
        System.out.println("result : " + Arrays.toString(result));
    }
}
