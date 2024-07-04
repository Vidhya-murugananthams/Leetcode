class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int left[]=new int[n];
        int right[]=new int[n];
        
        int minp=prices[0];
        for( int i=1;i<n;i++)
        {
            minp=Math.min(minp,prices[i]);
            left[i]=Math.max(left[i-1],prices[i]-minp);
            
        }
        
       int  maxp=prices[n-1];
        for( int i=n-2;i>=0;i--)
        {
            maxp=Math.max(maxp, prices[i]);
            right[i]=Math.max(right[i+1],maxp-prices[i]);
            
        }
       int  profit=0;
        for(int i=0;i<n;i++)
        {
           profit=Math.max(profit,left[i]+right[i]); 
        }
        return profit;
    }
}