package array.sortpeople;

import java.util.*;

public class SortPeopleSol {
    public String[] sortPeople(String[] names, int[] heights){
        /*Map<Integer, String> stringMap = new HashMap<>();
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            stringMap.put(heights[i], names[i]);
        }
        System.out.println(stringMap);

        TreeMap<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(stringMap);
        System.out.println(sortedMap);

        int i = 0;
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            String value = entry.getValue();
            result[i++] = value;
        }
        return result;*/

        Map<Integer, String> stringMap = new HashMap<>();
        String[] result = new String[heights.length];
        for (int i = 0; i < names.length; i++) {
            stringMap.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int j = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[j++] = stringMap.get(heights[i]);
        }
        return result;
    }
}
