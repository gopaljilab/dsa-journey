package array.plusOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        System.out.println("Digits : " + Arrays.toString(digits));
        PlusOneSol sol = new PlusOneSol();
        int[] newDigits = sol.plusOne(digits);
        System.out.println(Arrays.toString(newDigits));
    }
}
