package array.kidswithcandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandiesSol {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> greatestCandies = new ArrayList<>();
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= maxCandies){
                greatestCandies.add(true);
            }else {
                greatestCandies.add(false);
            }
        }
        return greatestCandies;
    }
}
