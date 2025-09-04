package array.sortedSquares;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        SortedSquaresSol sol = new SortedSquaresSol();
        int[] result = sol.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
        System.out.println(Math.abs(nums[0]));
    }
}
