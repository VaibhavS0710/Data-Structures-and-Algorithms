class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int profit = 0;
        int min = prices[0];

        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }else if(prices[i]-min>profit){
                profit = prices[i]-min;
                sum = sum + profit;
                profit = 0;
                min = prices[i];
            }
        }
        return sum;
    }
}
