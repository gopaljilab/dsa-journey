package math.leetcodebank;

import java.util.Scanner;

/**
 * int weeks = n / 7; // total weeks
 * int days = n % 7; // leftover days
 *
 * sumWeeks= weeks×(2×28+(weeks)×7)/2;
 *
 * sumDays= days[2×(weeks+1)+(days−1)]/2
 *
 * uses of summation of upto n numbers in AP(arithmatic progression)
 */

public class TotalMoney {
    public static int totalMoney(int n){
        /*int total = 0;
        int weeks = 0;
        while (n > 0){
            for (int day = 1; day <= 7 && n > 0; day++) {
                total += weeks + day;
                n--;
            }
            weeks++;
        }
        return total;*/

        int weeks = n / 7; // total weeks
        int days = n % 7; // leftover days
        int totalWeeks = weeks * (49 + 7 * weeks) / 2;  // total from all full weeks
        int totalDays = days * (2 * (weeks + 1) + (days - 1)) / 2; // leftover days

        return totalWeeks + totalDays;
    }
}
