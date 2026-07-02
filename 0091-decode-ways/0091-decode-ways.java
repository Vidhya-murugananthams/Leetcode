class Solution {
    private int find(String s,int[] dp,int i)
    {
    if(i == s.length())
        return 1;

    if(s.charAt(i) == '0')
        return 0;

    if(dp[i] != -1)
        return dp[i];

    int ways = 0;

    ways += find(s,dp,i+1);

    if(i < s.length()-1)
    {
        int num =
            (s.charAt(i)-'0')*10 +
            (s.charAt(i+1)-'0');

        if(num >= 10 && num <= 26)
            ways += find(s,dp,i+2);
    }

    return dp[i] = ways;
}


    public int numDecodings(String s) {
       //int num = Integer.parseInt(s);
       int[] dp = new int[s.length()];
       Arrays.fill(dp,-1);
       dp[s.length()-1] = 1;
       int ans = find(s, dp,0);

       return ans == -1 ? 0 : ans;

    }
}