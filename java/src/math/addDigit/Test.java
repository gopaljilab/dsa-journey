package math.addDigit;

public class Test {
    public static void main(String[] args) {
        int number = 1443902;
        System.out.print("Input : " + number);
        System.out.println();
        Solution solution = new Solution();
        int result =solution.addDigits(number);
        System.out.println("Output : "+result);
    }
}
