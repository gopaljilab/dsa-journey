package array.countmatches;

import java.util.*;

public class CountMatches {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);

        int index = map.get(ruleKey);

        for (List<String> itemInItems : items) {
            if (itemInItems.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList("phone", "blue", "pixel"),
                        Arrays.asList("computer", "silver", "lenovo"),
                        Arrays.asList("phone", "gold", "iphone")
                )
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println("Output : " + countMatches(items, ruleKey, ruleValue));
    }
}
