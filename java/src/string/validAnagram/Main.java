package string.validAnagram;

public class Main {
    public static void main(String[] args) {
        String string1 = "anagram";
        String string2 = "nagaram";
        System.out.println("Input : s = " + string1 + ", t = " + string2);

        ValidAnagram validAnagram = new ValidAnagram();
        boolean isAnagram =validAnagram.isAnagram(string1, string2);
        System.out.println("Output : " + isAnagram);
    }
}
