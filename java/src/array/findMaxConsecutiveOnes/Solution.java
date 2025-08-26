package array.findMaxConsecutiveOnes;

public class Solution {
    public static int maxConsecutiveOnes(int[] nums){
        int cons = 0;
        int maxCons = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                cons = 0;
            }else {
                cons += 1;
                if (cons > maxCons){
                    maxCons = cons;
                }
            }
           // maxCons = Math.max(cons,maxCons);;
        }
        return maxCons;
    }
}
