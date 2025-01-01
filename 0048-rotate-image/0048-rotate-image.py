class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        r=len(matrix)
        c=len(matrix[0])
        print(r,c)
        for i in range(r):
            for j in range(i,c):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        for i in range(c//2):
            for j in range(r):
                matrix[j][c-i-1],matrix[j][i]=matrix[j][i],matrix[j][c-i-1]
