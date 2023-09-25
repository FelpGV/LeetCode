package TopInterview150.ArrayString;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for (int number : nums){
            if(numbers.containsKey(number)){
                numbers.put(number, numbers.get(number) + 1);
            } else {
                numbers.put(number,1);
            }
        }
        for (Map.Entry<Integer,Integer> num : numbers.entrySet()){
            if(num.getValue() > nums.length/2){
                return num.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println(result);
    }
}
