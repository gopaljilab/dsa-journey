package array.sortpeople;

import java.util.Arrays;

public class SortPeopleMain {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        System.out.println("Input : " + Arrays.toString(names) + ", " + Arrays.toString(heights));
        SortPeopleSol sol = new SortPeopleSol();
        String[] sortPeoplesByHeight = sol.sortPeople(names, heights);
        System.out.println("Output : " + Arrays.toString(sortPeoplesByHeight));
    }
}
