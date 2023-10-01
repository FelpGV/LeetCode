package LeetCode75.ArrayString;

public class GreatestCommonDivisorStrings {
    public static String gcdOfStrings(String str1, String str2) {
        String s = str1.replace(str2,"");
        System.out.println(s);
        return "";
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result = gcdOfStrings(str1,str2);
        System.out.println(result);
    }
}
