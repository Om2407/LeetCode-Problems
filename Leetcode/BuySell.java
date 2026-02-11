public class BuySell {
    public static void main(String[] args) {
        int prices[] = { 7, 2, 4, 1, 5 };
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrices) {
                minPrices = prices[i];
            } else {
                int profit = prices[i] - minPrices;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        System.out.println(maxProfit);
    }
}
