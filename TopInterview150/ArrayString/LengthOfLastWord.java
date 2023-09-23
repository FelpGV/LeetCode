package TopInterview150.ArrayString;

import java.util.Arrays;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words =  s.split(" ");
        return words[words.length-1].toCharArray().length;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }
}
