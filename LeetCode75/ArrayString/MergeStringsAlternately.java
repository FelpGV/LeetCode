package LeetCode75.ArrayString;
//1768. Merge Strings Alternately
public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(),word2.length());
        int max = Math.max(word1.length(),word2.length());
        String word = (max == min) ? "" : (word1.length() > word2.length()) ? word1.substring(min) : word2.substring(min);
        StringBuilder merge = new StringBuilder();
        for (int i = 0; i < min; i++) {
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(i));
        }
        return merge + word;
    }

    public static void main(String[] args) {
        String word1 = "cdf";
        String word2 = "a";
        String result = mergeAlternately(word1,word2);
        System.out.println(result);
    }
}
