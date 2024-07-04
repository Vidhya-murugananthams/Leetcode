class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,min=Integer.MAX_VALUE, max=0;
        
        
        for( int i=0;i<n;i++)
        {
            if(prices[i]<min)
                min=prices[i];
            else
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}