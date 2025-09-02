package searching.targetIndices;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;

        SolutionTargetIndex solutionTargetIndex = new SolutionTargetIndex();
        List<Integer> result = solutionTargetIndex.targetIndices(nums,target);
        System.out.println(result);

    }
}
