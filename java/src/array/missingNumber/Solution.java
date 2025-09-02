package array.missingNumber;

public class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length ;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long expSum = n * (n + 1) / 2;

        return (int) (expSum - sum);
    }
}
