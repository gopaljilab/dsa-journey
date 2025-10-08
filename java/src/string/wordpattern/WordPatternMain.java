package string.wordpattern;

public class WordPatternMain {
    public static void main(String[] args) {
        String pattern = "abba";
        String s ="dog cat cat dog";
        System.out.println("Input : pattern = " + pattern + " ,s = " + s);
        WordPatternSol sol = new WordPatternSol();
        boolean result = sol.wordPattern(pattern, s);
        System.out.println("Output : " + result);   // true ,
                                                   // false for
                                                   // Input: pattern = "abba", s = "dog cat cat fish"
                                                    // Output: false
    }
}
