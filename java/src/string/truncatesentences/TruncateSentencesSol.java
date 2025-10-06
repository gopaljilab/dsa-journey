package string.truncatesentences;

public class TruncateSentencesSol {
    public String truncateSentence(String sentence, int words) {
        String[] strings;
        StringBuilder newSentence = new StringBuilder();
        strings = sentence.split(" ");
        for (int i = 0; i < words; i++) {
            newSentence.append(strings[i] + " ");
        }

        return newSentence.toString().trim();
    }
}
