package sorting.countingsort;

import java.util.Arrays;

public class CountSortClient {
    public static void main(String[] args) {
        CountingSort sort = new CountingSort();
        int[] arr = {1,2,4,6,2,6,3,1,5,2,6,2,8,4};
        int[] result = sort.countingSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
