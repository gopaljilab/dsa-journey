package math;

import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int newNum = 0;

        while (x > 0) {
            int digit = x % 10;
            newNum = newNum * 10 + digit;
            x = x / 10;
        }

        return original == newNum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("Check Palindrome Or not");
        System.out.println("Number (Which You Want to Check) :");
        int number1=121;
        System.out.println("Number : " + number1);
        boolean result1 = solution.isPalindrome(number1);
        System.out.println(result1);
        int number2=-121;
        System.out.println("Number : " + number2);
        boolean result2 = solution.isPalindrome(number2);
        System.out.println(result2);
        int number3=10;
        System.out.println("Number : " + number3);
        boolean result3 = solution.isPalindrome(number3);
        System.out.println(result3);
    }
}
