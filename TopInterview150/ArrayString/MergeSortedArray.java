package TopInterview150.ArrayString;

import java.util.Arrays;

public class MergeSortedArray {
    public static int[]  merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] result = merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(result));
    }
}
