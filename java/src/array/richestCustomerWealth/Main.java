package array.richestCustomerWealth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] customerWealth = {{1,2,3},{3,2,1}};
        System.out.println("Input : " + Arrays.deepToString(customerWealth));
        RIchestCustomerWealthSol sol = new RIchestCustomerWealthSol();
        int result = sol.maximumWealth(customerWealth);
        System.out.println("Output : " + result);
    }
}
