package string.reverseprefix;

public class ReversePrefixMain {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println("Input : word = " + word + ",ch = " + ch);
        ReversePrefixSol sol = new ReversePrefixSol();
        String result = sol.reversePrefix(word, ch);
        System.out.println("Output : " + result);
    }
}
