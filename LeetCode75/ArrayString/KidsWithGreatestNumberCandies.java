package LeetCode75.ArrayString;

import java.util.*;

//1431. Kids With the Greatest Number of Candies
public class KidsWithGreatestNumberCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int l = candies.length;
        int max = candies[0];
        for (int i = 1; i <= l-1; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        result.add(max <= candies[0]+extraCandies);
        for (int i = 1; i <= l-1; i++) {
            result.add(max <= candies[i]+extraCandies);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

}
