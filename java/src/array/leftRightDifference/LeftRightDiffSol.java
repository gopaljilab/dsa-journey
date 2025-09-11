package array.leftRightDifference;

import java.util.Arrays;

public class LeftRightDiffSol {
    public int[] leftRightDifference (int[] nums){
        int size = nums.length;
        if (size <= 1) return new int[1];

        int[] newNums = new int[size];
        int[] leftSum = new int[size];
        int[] rightSum = new int[size];

        leftSum[0] = 0;
        for (int i = 1; i < size; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        System.out.println("LeftSum : " + Arrays.toString(leftSum));

        rightSum[size - 1] = 0;
        for (int i = size - 2 ; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        System.out.println("RightSum : " + Arrays.toString(rightSum));

        for (int i = 0; i < size; i++) {
            newNums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return newNums;
    }
}
