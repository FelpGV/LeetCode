package Problems_1_to_50;
//43. Multiply Strings

import java.math.BigInteger;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        if(num1.length() == 0 || num2.length() == 0){
            return "0";
        }
        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1+n2];
        

        return "";
    }

    public static void main(String[] args) {
        String num1 = "6913259244";
        String num2 = "71103343";
        String result = multiply(num1,num2);
        System.out.println(result);
    }

}
