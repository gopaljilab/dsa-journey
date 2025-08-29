package searching.peakIndexInMountainArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,2,1,0};
        System.out.println("Input : " + Arrays.toString(arr));
        int peakIndex = Solution.isPeakIndex(arr);
        System.out.println("Output : " + peakIndex);
    }
}
