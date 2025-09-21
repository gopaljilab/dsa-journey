package array.minoperation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,9,7};
        int k = 5;
        System.out.println("Nums = " + Arrays.toString(nums) + ", K = " + k);
        MinOperationSol sol = new MinOperationSol();
        int noOfOps = sol.minOperation(nums, k);
        System.out.println(noOfOps);
    }
}
