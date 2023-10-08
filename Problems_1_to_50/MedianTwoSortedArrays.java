package Problems_1_to_50;

import java.util.Arrays;

//4. Median of Two Sorted Arrays
public class MedianTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0;
    }
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);

        Arrays.sort(nums3);

        int l = nums3.length/2;

        if (nums3.length % 2 == 0){
            return (nums3[l] + nums3[l-1]) / 2.0;
        } else {
            return nums3[l];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double result = findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}
