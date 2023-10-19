package problems_101_to_150;
//119. Pascal's Triangle II

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> n = new ArrayList<>(rowIndex);
        return n;
    }
    public static void main(String[] args) {
        int rowIndex = 1;
        List<Integer> result = getRow(rowIndex);
        System.out.println(result);
    }
}
