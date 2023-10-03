package LeetCode75.ArrayString;

import java.util.Arrays;
import java.util.HashMap;

//443. String Compression
public class StringCompression {
    public static  int compress(char[] chars) {
        char c = chars[0];
        int count = 1;
        StringBuilder comp = new StringBuilder(String.valueOf(c));
        for (int i = 1; i < chars.length; i++) {
            if(c == chars[i]){
                count += 1;
                if (i == chars.length-1){
                    comp.append(count);
                }
            } else {
                if(count > 1){
                    comp.append(count);
                }
                comp.append(chars[i]);
                count = 1;
                c = chars[i];
            }
        }
        int l = comp.toString().toCharArray().length;
        System.arraycopy(comp.toString().toCharArray(), 0, chars, 0, l);
        return  chars.length;
    }

    public static void main(String[] args) {
        char[] chars = {'a','c','b','b','a'};
        int result = compress(chars);
        System.out.println(result);
    }
}
