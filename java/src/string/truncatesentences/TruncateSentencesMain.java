package string.truncatesentences;

public class TruncateSentencesMain {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println("Input : s = " + s + " , k = " + k);
        TruncateSentencesSol sol = new TruncateSentencesSol();
        String result = sol.truncateSentence(s, k);
        System.out.println("Output : " + result);
    }
}
