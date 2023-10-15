package Problems_2501_to_2550;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//2540. Minimum Common Value
public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }
            if(nums1[i] > nums2[j]){
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }
    public static int getCommon2(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        for (int n : nums1) {
            n1.add(n);
        }
        for (int n : nums2){
            if(n1.contains(n)){
                common.add(n);
            }
        }
        ArrayList<Integer> listC = new ArrayList<>(common);
        if(!listC.isEmpty()){
            Collections.sort(listC);
            return listC.get(0);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,6};
        int[] nums2 = {2,3,4,5};
        int result = getCommon(nums1,nums2);
        System.out.println(result);
    }
}
