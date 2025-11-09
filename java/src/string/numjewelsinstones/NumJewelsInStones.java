package string.numjewelsinstones;

import java.util.*;

public class NumJewelsInStones {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> mapJewel = new HashSet<>();
        for(int i=0; i<jewels.length(); i++){
            mapJewel.add(jewels.charAt(i));
        }

        int noOfStonesJewels = 0;
        for(int i=0; i<stones.length(); i++){
            if(mapJewel.contains(stones.charAt(i))){
                noOfStonesJewels++;
            }
        }
        return noOfStonesJewels;
    }
}
