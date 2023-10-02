package LeetCode75.ArrayString;

import java.util.Arrays;

//345. Reverse Vowels of a String
public class ReverseVowelsString {
    public static boolean isVowel(Character v){
        return v == 'a' || v == 'A' || v == 'e' || v == 'E' ||
               v == 'i' || v == 'I' || v == 'o' || v == 'O' ||
               v == 'u' || v == 'U';
    }
    public static String reverseVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder sReverse = new StringBuilder(s);
        char[] sChar = s.toCharArray();
        for (char c : sChar) {
            if (isVowel(c)) {
                vowels.append(c);
            }
        }
        vowels.reverse();
        int j = 0;
        for (int i = 0; i < sChar.length; i++) {
            if (isVowel(sChar[i])) {
                sReverse.setCharAt(i, vowels.charAt(j));
                j++;
            }
        }
        return sReverse.toString();
    }
    public String reverseVowels2(String s) {
        StringBuilder vowels = new StringBuilder();
        char[] sChar = s.toCharArray();
        for (char c : sChar) {
            if (isVowel(c)) {
                vowels.append(c);
            }
        }
        vowels.reverse();
        int j = 0;
        for (int i = 0; i < sChar.length; i++) {
            if (isVowel(sChar[i])) {
                sChar[i] = vowels.charAt(j);
                j++;
            }
        }
        return String.valueOf(sChar);
    }

    public static void main(String[] args) {
        String s = "hello";
        String result = reverseVowels(s);
        System.out.println(result);
    }
}
