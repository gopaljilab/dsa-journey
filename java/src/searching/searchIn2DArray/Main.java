package searching.searchIn2DArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix ={{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}};
        int target = 3;
        System.out.println(Arrays.deepToString(matrix));

        SearchIn2DArraySol sol = new SearchIn2DArraySol();
        boolean isFounded = sol.searchMatrix(matrix, target);
        System.out.println(isFounded);
    }
}
