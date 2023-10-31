package Problems_1_to_50;
//46. Permutations

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<Integer> permutation(int[] nums){
        List<Integer> a = new ArrayList<>();
        return a;
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        int[] nums = {0,1};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }
}
