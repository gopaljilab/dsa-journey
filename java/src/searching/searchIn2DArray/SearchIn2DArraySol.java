package searching.searchIn2DArray;

public class SearchIn2DArraySol {
    boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int lowRow = 0;
        int highRow = rows - 1;

        while (lowRow <= highRow) {
            int midRow = (lowRow + highRow) / 2;

            // Check if target could be in this row
            if (target >= matrix[midRow][0] && target <= matrix[midRow][cols - 1]) {

                int lowCol = 0, highCol = cols - 1;
                while (lowCol <= highCol) {
                    int midCol = (lowCol + highCol) / 2;

                    if (matrix[midRow][midCol] == target) {
                        return true;
                    } else if (matrix[midRow][midCol] < target) {
                        lowCol = midCol + 1;
                    } else {
                        highCol = midCol - 1;
                    }
                }
                return false; // searched the row fully
            } else if (matrix[midRow][0] > target) {
                highRow = midRow - 1;
            } else {
                lowRow = midRow + 1;
            }
        }
        return false;
    }
}
