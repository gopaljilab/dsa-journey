package array.numberOfGoodPairs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.print("Input : " + Arrays.toString(nums));
        System.out.println();
        NoOfGoodPairs Pairs = new NoOfGoodPairs();
        int result = Pairs.noOfGoodPairs(nums);
        System.out.println("OutPut " + result);
    }
}
