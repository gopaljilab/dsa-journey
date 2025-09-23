package array.mostwordfound;

public class MostWordFoundSol {
    public int mostWordFound(String[] sentences){
        int maxWords = 0;
        for(int i = 0; i < sentences.length; i++){
            String sentence = sentences[i];
            int word = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' '){
                    word++;
                }
                if (word + 1 > maxWords){
                    maxWords = word + 1;
                }
            }
        }
        return maxWords;
    }
}
