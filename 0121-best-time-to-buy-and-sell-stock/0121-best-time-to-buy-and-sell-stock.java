class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        //loop for iteration
        for(int i=0;i<n;i++){
            if(buyPrice<prices[i]){
               int profit=prices[i]-buyPrice;//buyPrice(B.P) & price[i](S.P)
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}