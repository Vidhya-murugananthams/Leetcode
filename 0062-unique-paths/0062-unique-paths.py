class Solution:
    def paths(self, r, c, i,j,dp):
        if i==r-1 and j==c-1:
            return 1
        if i>=r or j>=c:
            return 0
        if dp[i][j]!=-1:
            return dp[i][j]
        dp[i][j]= self.paths(r,c,i,j+1,dp)+self.paths(r,c,i+1,j,dp)
        return dp[i][j]
    def uniquePaths(self, m: int, n: int) -> int:
        dp=[[-1]*n for i in range(m)]
        return self.paths(m,n,0,0,dp)
        