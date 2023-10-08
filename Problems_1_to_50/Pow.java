package Problems_1_to_50;
//50. Pow(x, n)
public class Pow {
    public static double myPow(double x, int n) {
        if(x == 0) return 0;
        if(n == 0) return 1;
        return Math.pow(x,n);
    }

    public static void main(String[] args) {
        double x = -3.50000;
        int n = -3;
        double result = myPow(x,n);
        System.out.println(result);
    }
}
