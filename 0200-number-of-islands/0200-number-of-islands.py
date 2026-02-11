class Solution:
    def dfs(self,r,c,i,j,grid):
        if i>=0 and  i<r and j>=0 and j<c and grid[i][j]=="1":
            grid[i][j]=0
            self.dfs(r,c,i,j+1,grid)
            self.dfs(r,c,i,j-1,grid)
            self.dfs(r,c,i+1,j,grid)
            self.dfs(r,c,i-1,j,grid)


    def numIslands(self, grid: List[List[str]]) -> int:
        count=0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j]=="1":
                    count+=1
                    self.dfs(len(grid),len(grid[0]),i,j,grid)
        return count


        