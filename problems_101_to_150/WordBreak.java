package problems_101_to_150;

import java.util.Arrays;
import java.util.List;

//139. Word Break
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] words = new boolean[s.length() + 1];
        words[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict){
                if(i >= word.length() && s.substring(i - word.length(), i).equals(word)){

                    words[i] = words[i] || words[i-word.length()];
                }
            }
        }
        return words[s.length()];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet","code") ;
        boolean result = wordBreak(s,wordDict);
        System.out.println(result);
    }
}
