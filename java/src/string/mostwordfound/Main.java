package string.mostwordfound;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"};
        System.out.println(Arrays.toString(sentences));
        MostWordFoundSol mostWordFoundSol = new MostWordFoundSol();
        int maxWord = mostWordFoundSol.mostWordFound(sentences);
        System.out.println(maxWord);
    }
}
