package array.besttimeforbuyorsellstock;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(Arrays.toString(prices));
        BestProfit profit = new BestProfit();
        int maxProfit = profit.bestProfit(prices);
        System.out.println(maxProfit);
    }
}
