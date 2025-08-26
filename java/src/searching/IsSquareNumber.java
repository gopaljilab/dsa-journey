package searching;

import java.util.Random;

public class IsSquareNumber {
    static boolean isSquareNum(int num){
        boolean isSquare = false;
        int squareNum;
            int left = 1;
            int right = num;
            while(left <= right){
                int mid = left + (right-left)/2;
                int numSquare = mid*mid;
                if (numSquare == num){
                    return true;
                }else if(numSquare < num){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        return isSquare;
    }
}
