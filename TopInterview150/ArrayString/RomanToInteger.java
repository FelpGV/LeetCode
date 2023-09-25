package TopInterview150.ArrayString;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int[] n = new int[s.length()];
        int integer = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M' -> n[i] = 1000;
                case 'D' -> n[i] = 500;
                case 'C' -> n[i] = 100;
                case 'L' -> n[i] = 50;
                case 'X' -> n[i] = 10;
                case 'V' -> n[i] = 5;
                case 'I' -> n[i] = 1;
                default -> {
                }
            }
        }
        for (int i = 0; i < s.length()-1; i++) {
            if (n[i] < n[i+1]){
                integer -= n[i];
            } else {
                integer += n[i];
            }
        }
        return integer + n[n.length-1];
    }

    public static void main(String[] args) {
        String s = "MMXXIII";
        int result = romanToInt(s);
        System.out.println(result);
    }
}
