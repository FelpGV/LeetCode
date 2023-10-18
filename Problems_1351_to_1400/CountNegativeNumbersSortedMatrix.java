package Problems_1351_to_1400;
//1351. Count Negative Numbers in a Sorted Matrix
public class CountNegativeNumbersSortedMatrix {

    public static int countNegatives(int[][] grid) {
        int negatives = 0;
        int row = 0, col;
        while(row < grid.length){
            col = 0;
            while (col < grid[0].length){
                if(grid[row][col] < 0){
                    negatives++;
                }
                col++;
            }
            row++;
        }

        return negatives;
    }

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int result = countNegatives(grid);
        System.out.println(result);
    }

}
