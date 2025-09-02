package array.replaceElements;

import java.util.Arrays;

public class Solution {
    public static int[] replaceElement(int[] arr){
        int arrLength = arr.length-1;
        for (int i = 0; i <= arrLength; i++) {
            int maxValue = -1;
            for (int j = i + 1; j <= arrLength; j++) {
                /*if (maxValue < arr[j]){
                    maxValue = arr[j];
                }
                arr[i] = maxValue;*/

                maxValue = Math.max(maxValue,arr[j]);
            }
        }
        arr[arrLength-1] = -1;
        return arr;
    }
}
