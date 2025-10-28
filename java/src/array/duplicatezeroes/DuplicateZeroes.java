package array.duplicatezeroes;

import java.util.Arrays;

public class DuplicateZeroes {
    /*public static void duplicateZeroes(int[] arr){
        for(int i=0; i<arr.length; i++){
            if (arr[i] == 0){
                for (int j = arr.length-1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }

    }*/

    public static void duplicateZeroes(int[] arr){
        int zeros = 0;
        int length = arr.length;

        // count zeros
        for(int num : arr)
            if (num == 0) zeros++;

        for(int i = length-1; i >= 0; i--){
            if (i + zeros < length) {
                arr[i + zeros] = arr[i];
            }

            // If element is zero, duplicate it
            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < length) {
                    arr[i + zeros] = 0;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        System.out.println("Input: " + Arrays.toString(arr));
        duplicateZeroes(arr);
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
