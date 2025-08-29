package searching.transposeMatrix;

public class Solution {
    public static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int column = matrix[0].length;
        int [][] ans =new int [column][rows];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < rows; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
