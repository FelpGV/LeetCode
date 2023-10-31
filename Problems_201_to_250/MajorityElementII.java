package Problems_201_to_250;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//229. Majority Element II
public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> num = new ArrayList<>();
        Map<Integer,Integer> count = new HashMap<>();
        for (int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        int appear = nums.length/3;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > appear) {
                num.add(entry.getKey());
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> result = majorityElement(nums);
        System.out.println(result);
    }
}
