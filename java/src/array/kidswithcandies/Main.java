package array.kidswithcandies;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println("Candies = " + Arrays.toString(candies) + "extraCandies = "+ extraCandies);
        KidsWithCandiesSol sol = new KidsWithCandiesSol();
        List<Boolean> result = sol.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}
