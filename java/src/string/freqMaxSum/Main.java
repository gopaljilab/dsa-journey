package string.freqMaxSum;

public class Main {
    public static void main(String[] args) {
        String s = "aeiaeia";
        System.out.println(s);

        FreqMaxSumSol sol = new FreqMaxSumSol();
        int maxFreq = sol.freqMaxSum(s);
        System.out.println(maxFreq);
    }
}
