package array.findMiddleIndex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(Arrays.toString(nums));
        FIndMiddleIndexSol fIndMiddleIndexSol = new FIndMiddleIndexSol();
        int middleIndex = fIndMiddleIndexSol.findMiddleIndex(nums);
        System.out.println(middleIndex);
    }
}
