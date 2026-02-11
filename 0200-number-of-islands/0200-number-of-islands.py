class Solution:
    def dfs(self,r,c,i,j,grid):
        if i>=0 and  i<r and j>=0 and j<c and grid[i][j]=="1":
            grid[i][j]=0
            self.dfs(r,c,i,j+1,grid)
            self.dfs(r,c,i,j-1,grid)
            self.dfs(r,c,i+1,j,grid)
            self.dfs(r,c,i-1,j,grid)


    def numIslands(self, grid: List[List[str]]) -> int:
        r=len(grid)
        c=len(grid[0])
        count=0
        for i in range(r):
            for j in range(c):
                if grid[i][j]=="1":
                    count+=1
                    self.dfs(r,c,i,j,grid)
        return count


        