class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length-1;
        int n = grid[0].length-1;
        int[][]dp = new int[m+2][n+2];
       
        dp[0][0] = grid[0][0];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0) continue;
                else if(i==0){
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                }else if(j==0){
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                }else{
                    dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    
}