class Solution {
private int count=0;
    public int totalNQueens(int n) {
        if(n==1)
            return 1;
       else  if(n<4)
        return 0;
        
        int arr[][]=new int [n][n];
            queen(arr,0,0,n);
    return count;}
    
    private  void queen(int[][]arr, int r, int c, int n)
    {
        if(r==n)
        {
            count++;
             return;
        }
        for(  c=0;c<n;c++)
        {
    if(ifsafe(arr, r,c,n)&& arr[r][c]==0){
            arr[r][c]=2;
      
            queen(arr,r+1,c,n);
            arr[r][c]=0;
            }
        } }
private  boolean ifsafe( int arr[][] , int r, int c, int n)
{
    for( int i=0;i<r;i++)
    {
        if(arr[i][c]==2)
            return false;
        
    }
    for( int i=r-1, j=c-1 ; i>=0&&j>=0;i--,j--)
    {
        if(arr[i][j]==2)
            return false;
    }
    for( int i=r-1, j=c+1 ; i>=0&&j<n;i--,j++)
    {
        if(arr[i][j]==2)
            return false;
    }
    return true;
}
        
    
}