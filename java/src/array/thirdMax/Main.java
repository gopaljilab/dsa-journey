package array.thirdMax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println("Nums : " + Arrays.toString(nums));
        ThirdMaxSol sol = new ThirdMaxSol();
        int thirdMax = sol.thirdMax(nums);
        System.out.println(thirdMax);
    }
}
