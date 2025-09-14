package math.differenceOfSum;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;

        System.out.println("m : " + m + "," + " n : " + n);
        DifferenceOfSum sum = new DifferenceOfSum();
        int result = sum.differenceOfSums(n,m);
        System.out.println(result);
    }
}
