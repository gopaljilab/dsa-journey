package string.scoreOfString;

public class Solution {
    public int scoreOfString(String s){
        int score = 0, sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            sum = ((int)s.charAt(i) - (int) (s.charAt(i+1)));
            if (sum < 0){
                sum = -sum;
            }
            score += sum;
        }
        return score;
    }
}
