package string.lengthOfLastWord;

public class Main {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        LengthOfLastWordSol length = new LengthOfLastWordSol();
        int result = length.lengthOfLastWord(str);
        System.out.println(result);
    }
}
