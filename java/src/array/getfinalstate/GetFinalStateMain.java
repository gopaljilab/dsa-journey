package array.getfinalstate;

import java.util.Arrays;

public class GetFinalStateMain {
    public static void main(String[] args) {
        int[] nums = {2,1,3,5,6};
        int k = 5;
        int multiplier = 2;
        System.out.println("Input : nums = " + Arrays.toString(nums)
                + ", k = " + k + ", multiplier = " + multiplier);
        GetFinalStateSol sol = new GetFinalStateSol();
        int[] result = sol.finalState(nums, k, multiplier);
        System.out.println("Output : " + Arrays.toString(result));
    }
}
