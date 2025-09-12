package array;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println("Numbers : " + Arrays.toString(arr));
        int result = SingleNumber.singleNumber(arr);
        System.out.println(result);
    }

    private static int singleNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            int occurrence = 0;

            for (int j = 0; j < arr.length; j++) {
                if (target == arr[j]) {
                    occurrence++;
                }
            }

            if (occurrence == 1) {
                return target;
            }
        }
        return 0;
    }
}
