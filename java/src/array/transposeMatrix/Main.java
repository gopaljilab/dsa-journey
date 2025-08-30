package searching.transposeMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println("Input : " + Arrays.deepToString(matrix));
        int[][] newMatrix = Solution.transpose(matrix);
        System.out.println("Output : " + Arrays.deepToString(newMatrix));
    }
}
