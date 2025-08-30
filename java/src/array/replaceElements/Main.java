package array.replaceElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println("Input = " + Arrays.toString(arr));
        int[] newArr = Solution.replaceElement(arr);
        System.out.println("Output = " + Arrays.toString(newArr));
    }
}
