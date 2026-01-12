package array.finalpriceafterdiscount;

public class FinalPriceAfterDiscount {
    public static int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            int finalPrice = prices[i];  // Start with original price

            // Look for first j > i where prices[j] <= prices[i]
            for (int j = i+1; j < prices.length; j++){
                if (prices[j] <= prices[i]) {
                    finalPrice = prices[i] - prices[j];
                    break;
                }
            }

            // If no discount found, price remains the same
            answer[i] = finalPrice;
        }

        return answer;
    }
}
