package Problems_1_to_50;
//48. Rotate Image

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int[][] m = new int[matrix.length][matrix.length];
        for (int i = 0, pos = matrix.length-1; i < matrix.length; i++,pos--) {
            for (int j = 0; j < matrix.length; j++) {
                m[j][pos] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(m[i], 0, matrix[i], 0, matrix.length);
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       rotate(matrix);
    }
}
