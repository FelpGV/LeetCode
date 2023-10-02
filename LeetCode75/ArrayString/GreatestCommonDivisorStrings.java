package LeetCode75.ArrayString;

// 1071. Greatest Common Divisor of Strings

public class GreatestCommonDivisorStrings {
    public static int gcd(int maxStr, int minStr){
        return (minStr == 0) ? maxStr : gcd(minStr, maxStr%minStr);
    }
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int maxStr = Math.max(str1.length(), str2.length());
        int minStr = Math.min(str1.length(), str2.length());
        return str1.substring(0,gcd(maxStr,minStr));
    }

    public static void main(String[] args) {
//        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
//        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
//        String str1 = "ABABABAB";
//        String str2 = "ABAB";
//        String str1 = "CXTXNCXTXNCXTXNCXTXNCXTXN";
//        String str2 = "CXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXN";
        String str1 = "NLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGM";
        String str2 = "NLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGM";
        String result = gcdOfStrings(str1,str2);
        System.out.println(result);
    }
}
