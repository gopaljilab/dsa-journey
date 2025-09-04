package string.lengthOfLastWord;

public class LengthOfLastWordSol {
    public int lengthOfLastWord(String s){
        int sizeOfString = s.length() - 1;
        int lastWordLength = 0;

        while (sizeOfString >= 0 && s.charAt(sizeOfString) == ' '){
            sizeOfString--;
        }

        while (sizeOfString >= 0 && s.charAt(sizeOfString) != ' '){
            lastWordLength++;
            sizeOfString--;
        }
        return lastWordLength;
    }
    
}
