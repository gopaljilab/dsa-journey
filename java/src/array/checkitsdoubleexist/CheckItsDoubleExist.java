package array.checkitsdoubleexist;

import java.util.Arrays;

public class CheckItsDoubleExist {
    public static boolean checkIfExist(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0,-2,2};
        System.out.println("Input: " + Arrays.toString(arr));
        boolean isDoubleExist = checkIfExist(arr);
        System.out.println("Output: " + isDoubleExist);
    }
}
