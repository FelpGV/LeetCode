package TopInterview150.Hashmap;
import java.util.HashSet;
import java.util.Set;

//202. Happy Number
public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int sum;
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            sum = 0;
            while (n!= 0){
              sum += (n % 10) * (n % 10);
              n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
    public static boolean isHappy2(int n) {
        int sum = 0;
        Set<Integer> seen = new HashSet<>();
        while (true) {
            String nString = String.valueOf(n);
            String[] digits = nString.split("");
            for (String d : digits){
                int numSquare = Integer.parseInt(d);
                sum += numSquare*numSquare;
            }
            n = sum;
            sum = 0;
            if(n == 1){
                return true;
            }
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
        }
    }

    public static void main(String[] args) {
        int n = 19;
        boolean result = isHappy(n);
        System.out.println(result);
    }
}
