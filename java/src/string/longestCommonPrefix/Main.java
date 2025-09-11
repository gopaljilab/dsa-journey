package string.longestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        LongestCommonPrefix sol = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        StringBuffer result = sol.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
