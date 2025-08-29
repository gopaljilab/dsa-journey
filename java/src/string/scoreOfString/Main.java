package string.scoreOfString;

public class Main {

    public static void main(String[] args) {
        String word = "hello";
        System.out.println("Input : " + word);
        Solution solution = new Solution();
        int result = solution.scoreOfString(word);
        System.out.println("Output : " + result);
    }
}
