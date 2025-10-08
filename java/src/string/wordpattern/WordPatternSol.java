package string.wordpattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class WordPatternSol {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> patternToWordMap = new HashMap<>();
        Set<String> mappedWords = new HashSet<>();

        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            if (patternToWordMap.containsKey(currentChar)) {
                if (!patternToWordMap.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                if (mappedWords.contains(currentWord)) {
                    return false;
                }
                patternToWordMap.put(currentChar, currentWord);
                mappedWords.add(currentWord);
            }
        }
        return true;
    }
}
