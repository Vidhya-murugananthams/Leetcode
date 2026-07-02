class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int[] i: dp) {
            Arrays.fill(i, -1);
        }
        return func(m-1, n-1, grid, dp);
    }

    int func(int m, int n, int arr[][], int dp[][]){
        if(m==0 && n==0) return arr[0][0];
        if(m<0||n<0) return (int) 1e9;
        if(dp[m][n]!=-1) return dp[m][n];
        int top = arr[m][n] + func(m-1,n,arr, dp);
        int left = arr[m][n] + func(m, n-1, arr, dp);
        return dp[m][n] = Math.min(top, left);
    }
}