package string.freqMaxSum;

import java.util.Hashtable;

public class FreqMaxSumSol {
    public int freqMaxSum(String s){
        /* int maxFreqVowels = 0;
        int freqCons = 0;
        int freqA = 0;
        int freqE = 0;
        int freqI = 0;
        int freqO = 0;
        int freqU = 0;

        char singleChar;
        for (int i = 0; i < s.length(); i++) {
            singleChar = s.charAt(i);
            if (singleChar == 'a'){
                freqA += 1;
            } else if (singleChar == 'e' ) {
                freqE += 1;
            } else if (singleChar == 'i') {
                freqI += 1;
            } else if (singleChar == 'o') {
                freqO += 1;
            } else if (singleChar == 'u') {
                freqU += 1;
            } else {
                freqCons += 1;
            }
            maxFreqVowels = Math.max(freqA,freqE) > Math.max(freqE,fr) ;
        }
        return Math.max(freqCons, maxFreqVowels);*/
        int maxFrq = 0;
        int maxVowelsFrq = 0;
        int maxConsFreq = 0;
        Hashtable<Character, Integer> map = new Hashtable<>();
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('u', 1);

        for (int i = 0; i < s.length(); i++){
            if (map.contains(s.charAt(i))){
                maxVowelsFrq += map.get(s.charAt(i));
            }else {
                maxConsFreq += 1;
            }
        }
        maxFrq = Math.max(maxVowelsFrq, maxConsFreq);
        return maxFrq;
    }
}
