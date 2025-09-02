package searching.countNegatives;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        CountNegativesSolution countNegativesSolution = new CountNegativesSolution();
        int countNegatives = countNegativesSolution.countNegatives(grid);
        System.out.println(countNegatives);
    }
}
