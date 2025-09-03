package searching.countNegatives;

public class CountNegativesSolution {
    public int countNegatives(int[][] grid) {
        int gridLength = grid.length;
        int countNegative = 0;
        int index = 0;
        for (int[] row : grid){
            index = firstNegative(row);
            countNegative += (row.length - index);
        }
        return countNegative;
    }

    public int firstNegative(int[] row){
        int left = 0; int right = row.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (row[mid] < 0){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
