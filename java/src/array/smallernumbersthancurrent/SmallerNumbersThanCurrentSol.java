package array.smallernumbersthancurrent;

public class SmallerNumbersThanCurrentSol {
    public int[] smallerNumbersThanCurrent(int[] nums){
        int[] result = new int[nums.length];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            int element = nums[i];
            int minElements = 0;
            for (int j = 0; j < nums.length; j++) {
                if (element > nums[j]){
                    minElements += 1;
                }
            }
            result[index++] = minElements;
        }
        return result;
    }
}
