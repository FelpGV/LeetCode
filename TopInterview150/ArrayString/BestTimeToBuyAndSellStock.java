package TopInterview150.ArrayString;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if(min > prices[i]){
                min = prices[i];
                max = min;
            }
            if(max < prices[i]){
                max = prices[i];
            }
            if(max-min > profit){
                profit = max - min;
            }
        }
        return profit;
    }

    public static int maxProfit2(int[] prices) {
        int profit;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            profit = prices[i] - min;
            if (profit > 0 && profit > max) {
                max = profit;
            }
            if (min > prices[i]) {
                min = prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {2,4,1};
        int result = maxProfit2(prices);
        System.out.println(result);
    }
}
