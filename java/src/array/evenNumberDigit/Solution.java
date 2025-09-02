package array.evenNumberDigit;

public class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = 0;
            while (num > 0) {
                int digit = num % 10;
                count++;
                num /= 10;
            }
            evenCount += (count % 2 == 0) ? 1 : 0;
        }

        return evenCount;
    }
}
