package array.diagonalSum;

public class DiagonalSumSol {
    public int diagonalSum(int[][] mat){
        int sumOfDiagonals = 0;
        int rowsOfMatrix = mat.length;
        int columnsOfMatrix = mat[0].length;
        for (int i = 0; i < rowsOfMatrix; i++) {
            for (int j = 0; j < columnsOfMatrix; j++) {
                if (i == j){
                    sumOfDiagonals += mat[i][j];
                }
                if ((i + j) == (rowsOfMatrix - 1)){
                    sumOfDiagonals += mat[i][j];
                }
            }
        }

        if (!(rowsOfMatrix % 2 == 0)) {
            int n = rowsOfMatrix - ((rowsOfMatrix / 2) + 1);
            sumOfDiagonals = sumOfDiagonals - mat[n][n];
        }
        return sumOfDiagonals;
    }
}
