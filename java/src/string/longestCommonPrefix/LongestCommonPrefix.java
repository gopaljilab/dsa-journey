// pending

package string.longestCommonPrefix;

public class LongestCommonPrefix {
    public StringBuffer longestCommonPrefix(String[] strs){
        StringBuffer result = new StringBuffer(new StringBuilder());
        for(int i = 0; i < strs.length-1; i++){
            String str = strs[i];
            String str2 = strs[i+1];
            for(int j=0; j < str.length(); j++){
                if(str.charAt(j) == str2.charAt(j)){
                    result.append(str.charAt(j));
                }
            }
        }
        return result;
    }
}
