package math.fibonaccinumber;

public class FibonacciSolution {
    public int fib(int n) {
        if (n <= 0) return 0;
        if (n==1) return 1;
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;

        for (int i = 2; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return nextTerm;
    }
}
