package math.climbingstairs;

public class ClimbingStairsWays {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;

        int firstStaitsWays = 1;
        int secondStairWays = 2;
        int nextStairWays = 0;

        for (int i = 3; i <= n; i++) {
            nextStairWays = firstStaitsWays + secondStairWays;
            firstStaitsWays = secondStairWays;
            secondStairWays = nextStairWays;
        }
        return nextStairWays;
    }
}
