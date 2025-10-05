package array.diagonalSum;

import java.util.Arrays;

public class DiagonalSumMain {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Input : matrix = " + Arrays.deepToString(matrix));
        DiagonalSumSol sol = new DiagonalSumSol();
        int sumOfDiagonals = sol.diagonalSum(matrix);
        System.out.println("Output : " + sumOfDiagonals);
    }
}
