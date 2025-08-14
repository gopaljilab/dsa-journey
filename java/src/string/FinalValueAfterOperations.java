package string;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"--X", "++X", "X--"};
        int result = finalValue(operations);

        System.out.print("Input : ");
        for (int i = 0; i < operations.length; i++) {
            System.out.print(operations[i] + " ");
        }
        System.out.println();
        System.out.println("Output : " + result);
    }

    public static int finalValue(String[] operations) {
        int result = 0;
        for (String op : operations) {
            result += (op.equals("--X") || op.equals("X--")) ? -1 : 1;
        }
        return result;
    }
}
