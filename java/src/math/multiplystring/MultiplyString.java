package math.multiplystring;

import java.math.BigInteger;

public class MultiplyString {
    public static String multiply(String num1, String num2) {
        /*BigInteger num1ToInteger = new BigInteger(num1);
        BigInteger num2ToInteger = new BigInteger(num2);
        BigInteger multiply;
        multiply = num2ToInteger.multiply(num1ToInteger);
        return multiply.toString();*/

        int string1ToNum1 = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(num1.charAt(i)));
            string1ToNum1 += digit * 10;
        }
        System.out.println(string1ToNum1);
        return " ";
    }

    public static void main(String[] args) {
        String s = "2";
        String t = "3";
        String result = multiply(s,t);
        System.out.println(result);
    }
}
