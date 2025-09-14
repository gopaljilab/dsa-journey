package array.besttimeforbuyorsellstock;

public class BestProfit {
    public int bestProfit(int[] prices){
        /*Arrays.sort(prices);
        int buy = prices[0];
        int sell = prices[prices.length-1];
        int profit = sell - buy;
        return profit;*/


        /** int maxProfit = 0;
        int buy = 0, sell = 0;

        for (int i = 0; i < prices.length; i++) {
            buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                sell = prices[j];
                if ((sell - buy) > maxProfit){
                    maxProfit = sell - buy;
                }
            }
        }
        return maxProfit; */
        int maxProfit = 0;
        int minBuy = Integer.MAX_VALUE;

        for (int sell : prices){
            if (sell < minBuy){
                minBuy = sell;
            } else if (sell - minBuy > maxProfit) {
                maxProfit = sell - minBuy;
            }
        }
        return maxProfit;
    }
}
