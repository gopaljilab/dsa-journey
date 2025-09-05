package array.richestCustomerWealth;

public class RIchestCustomerWealthSol {
    public int maximumWealth(int[][] accounts){
        int accountSize = accounts.length;
        int wealthSize = accounts[0].length;
        int maxWealth = 0;
        for (int i = 0; i < accountSize; i++) {
            int tempMaxWealth = 0;
            for (int j = 0; j < wealthSize; j++) {
                tempMaxWealth += accounts[i][j];
            }
            if (tempMaxWealth > maxWealth){
                maxWealth = tempMaxWealth;
            }
        }

        return maxWealth;
    }
}
