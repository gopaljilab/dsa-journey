package string.findthedifference;

public class FindTheDifferenceMain {
    public static void main(String[] args) {
        FindTheDifferenceSolution solution = new FindTheDifferenceSolution();
        String s = "a";
        String t = "aa";
        System.out.println("Input : S = " + s + ", t = " + t);
        char result = solution.findTheDifference(s, t);
        System.out.println("Output : " + result);
    }
}
