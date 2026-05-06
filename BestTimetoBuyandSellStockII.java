// Best Time to Buy and Sell Stock II

class Solution {
    public int maxProfit(int[] prices) {
        int totalPrice = 0;

        for(int i=1; i<prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                totalPrice += prices[i] - prices[i-1];
            }
        }
        return totalPrice;
    }
}