package searching.countNegatives;

public class CountNegativesSolution {
    public int countNegatives(int[][] grid) {
        int gridLength = grid.length;
        int countNegative = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] subArray = grid[i];
            for (int j = 0; j < grid[i].length; j++) {
                if (subArray[j] < 0) {
                    countNegative += (subArray.length - countNegative);
                    break;
                }
            }
            // int left = 0;
            // int right = subArray.length;

            // while(left<right){
            //     int mid = left + (right - left);

            //     if(subArray[mid] = -1)
            // }
        }
        return countNegative;
    }
}
