package array;

public class areaOfMaxDiagonal {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double longestDig = 0;
        int maxArea = 0;

        for(int i=0; i<dimensions.length; i++){
                int length = dimensions[i][0];
                int width = dimensions[i][1];

                double diagonal = Math.sqrt(length*length + width*width);
                if(longestDig < diagonal){
                    longestDig = diagonal;
                    maxArea = length * width;
                }else if(diagonal == longestDig) {
                    maxArea = Math.max(maxArea, length * width);
                }
        }
        return maxArea;
    }
}
