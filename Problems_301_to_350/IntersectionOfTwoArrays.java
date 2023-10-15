package Problems_301_to_350;
//349. Intersection of Two Arrays

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> u = new HashSet<>();
        ArrayList<Integer> n1 = new ArrayList<>();
        for (int n : nums1) {
            n1.add(n);
        }
        for (int n : nums2){
            if(n1.contains(n)){
                u.add(n);
            }
        }
        int[] r = new int[u.size()];
        int i = 0;
        for (int n: u){
            r[i++] = n;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
