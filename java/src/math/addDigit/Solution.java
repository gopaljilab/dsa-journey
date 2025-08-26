package math.addDigit;

class Solution {
    static int addDigits(int number){
        int sumOfDigit = 0;
        while(number > 0 || sumOfDigit > 9){
            if(number == 0){
                number = sumOfDigit;
                sumOfDigit = 0;
            }
            sumOfDigit = sumOfDigit + (number % 10);
            number = number / 10;
        }
        return sumOfDigit;
    }
}