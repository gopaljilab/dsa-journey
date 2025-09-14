package math.differenceOfSum;

public class DifferenceOfSum {
    public int differenceOfSums(int n, int m) {
        int size = 0;
        int sumNotDiv = 0;
        int sumDiv = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                sumNotDiv += i;
            } else {
                sumDiv += i;
            }
        }

        return sumNotDiv - sumDiv;
    }
}
