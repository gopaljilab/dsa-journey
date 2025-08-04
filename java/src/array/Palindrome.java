package array;

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
        Solution solution = new Solution();
        int number=0;
        boolean result = solution.isPalindrome(number);
        System.out.println(result);
    }
}
