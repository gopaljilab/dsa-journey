package math.happyNumber;

public class Solution {
    public static boolean isHappy(int num){
        if (num <= 0) return false;
        int sum = num , temp = num;

        while (sum > 9){
            sum = 0;
            while (temp > 0){
                int digit = temp % 10;   // extract last digit
                sum += digit * digit;   // add square of digit
                temp /= 10;
            }
            temp = sum;
        }

        if (sum == 1 || sum == 7){
           return true;
        }
        return false;
    }
}
