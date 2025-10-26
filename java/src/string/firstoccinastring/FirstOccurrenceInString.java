package string.firstoccinastring;

public class FirstOccurrenceInString {
    public static int checkFirstOccurrence(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // Edge case: needle is empty or longer than haystack
        if (m == 0) return 0;
        if (m > n) return -1;

        // Check all possible starting positions in haystack
        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) return i;
        }
        return -1;
    }
}
