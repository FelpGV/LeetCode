package TopInterview150.ArrayString;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k;
        int pos = 1;
        for (int i = 1; i < nums.length; i++) {
            k = nums[i-1];
            if(nums[i] != k){
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }

    public static int removeDuplicates2(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
        }
        return ++k;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates2(nums);
        System.out.println(result);
    }
}
