package Problems_1401_to_1450;

import java.util.ArrayList;
import java.util.List;

//1425. Constrained Subsequence Sum
public class ConstrainedSubsequenceSum {
    public static int constrainedSubsetSum(int[] nums, int k) {
        int sum = 0;
        List<Integer> sub = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1] - nums[i] <= k){
                sub.add(nums[i]);
                sub.add(nums[i+1]);
            }
        }
        for(int n : sub){
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {10,2,-10,5,20};
        int k = 2;
        int result = constrainedSubsetSum(nums,k);
        System.out.println(result);
    }
}
