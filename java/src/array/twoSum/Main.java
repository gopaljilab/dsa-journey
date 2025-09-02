package array.twoSum;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,3,9};
        int target = 9;
        TwoSumProblem solution = new TwoSumProblem();
        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found.");
        }
    }
}
