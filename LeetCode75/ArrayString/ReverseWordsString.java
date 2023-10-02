package LeetCode75.ArrayString;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

//151. Reverse Words in a String
public class ReverseWordsString {
    public static String reverseWords(String s) {
        String[] s_  = s.trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();
        for (int i = s_.length-1; i >= 0; i--) {
            reverse.append(s_[i]);
            if(i > 0){
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }

    public static String reverseWords2(String s) {
        String[] s_  = s.trim().split("\\s+");
        return Arrays.stream(s_).collect(Collectors.collectingAndThen(Collectors.toList(),
                word -> {
                    Collections.reverse(word);
                    return String.join(" ", word);
                }
        ));
    }

    public static void main(String[] args) {
        String s = "the  sky is blue ";
//        String s = " hello world ";
        String result = reverseWords(s);
        System.out.println(result);
    }
}
