package array.missingNumber;

import java.util.Arrays;

public class Soltution {
    public int missingNumber(int[] arr){
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (arr[i+1] + 1)){
                return (arr[i] + 1);
            }
        }

        return 0;
    }
}
