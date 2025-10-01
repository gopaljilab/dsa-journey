package string.addstring;

import java.math.BigInteger;

public class AddStringSol {
    public String addString(String num1, String num2) {
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);

        BigInteger sum = bigNum1.add(bigNum2);
        String result2 = sum.toString();

        System.out.println(result2);

        return result2;
    }
}
