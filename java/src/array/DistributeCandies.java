package array;

import java.util.HashSet;
import java.util.Set;

class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        int uniqueCount = uniqueCandies.size();
        int maxCandiesToEat = candyType.length / 2;

        return Math.min(uniqueCount, maxCandiesToEat);
    }
}