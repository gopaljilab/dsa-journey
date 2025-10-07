package string.wordpattern;

import java.util.HashMap;
import java.util.Map;

class WordPatternSol {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> stringMap = new HashMap<>();
        String[] wordArray = s.split(" ");
        for (int i = 0; i < pattern.length(); i++) {
            stringMap.put(pattern.charAt(i), wordArray[i]);
        }
        System.out.println(stringMap);

        for (int i = 0; i < pattern.length(); i++) {
            System.out.println((stringMap.get(pattern.charAt(i))));
            if (!(stringMap.get(pattern.charAt(i)) == wordArray[i])){
                return false;
            }
        }
        return true;
    }
}
