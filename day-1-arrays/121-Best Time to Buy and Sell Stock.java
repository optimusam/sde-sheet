class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = (int)1e9;
        for(int price: prices) {
            minPrice = Math.min(minPrice, price);
            profit = Math.max(profit, price-minPrice);
        }
        return profit;
    }
}