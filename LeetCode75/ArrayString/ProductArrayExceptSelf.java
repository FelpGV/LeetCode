package LeetCode75.ArrayString;

import java.util.Arrays;
import java.util.stream.IntStream;

//238. Product of Array Except Self
public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] productResult = new int[nums.length];
        int product = 1;
        int zeros = 0;
        for (int i = 0; i <= nums.length-1; i++) {
            if(nums[i] != 0){
                product *= nums[i];
            } else {
                zeros++;
                if(zeros > 1){
                    return productResult;
                }
            }
        }
        int zero = 0;
        if(zeros == 1){
            zero = product;
            product = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            productResult[i] = (nums[i] != 0)
                    ? product/nums[i]
                    : zero;

        }
        return productResult;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
//        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
