class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        r=len(matrix)
        c=len(matrix[0])
        for i in range(r):
            for j in range(i,c):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        for i in range(r):
            for j in range(c//2):
                matrix[i][j],matrix[i][c-j-1]=matrix[i][c-j-1],matrix[i][j]
    