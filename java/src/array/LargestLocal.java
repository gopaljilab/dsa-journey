package array;

public class LargestLocal {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] resultGrid = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int maxVal = Integer.MIN_VALUE;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        maxVal = Math.max(maxVal, grid[k][l]);
                    }
                }
                resultGrid[i][j] = maxVal;
            }
        }
        return resultGrid;
    }
}
