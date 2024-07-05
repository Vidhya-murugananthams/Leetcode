class Solution {
    public void solveSudoku(char[][] board) {
        if(check( board,0,0,9)){
         for( int i=0;i<9;i++)
        {
            for( int j=0;j<9;j++)
            {
                System.out.print(board[i][j]+" ");
            }
                System.out.println();
        }
    }
    
    else
        System.out.print("No Solution exists");
        
    }
     public static  boolean check( char [][]board, int r, int c, int n)
    {
        if(r==n-1 && c==n){
            return true;
        }
        if(c==n)
        {
            r++;
            c=0;
        }
        if(board[r][c]!='.')
           return check(board, r,c+1,n);
        for( int num=1;num<=n;num++)
        {
            char ch=(char)(num+'0');
            if(ifsafe(board, r,c,n,ch ))
            {
                board[r][c]=(char)(num+'0');
                if(check(board, r,c+1,n))
                return true;
            
               
            }
        }
         board[r][c]='.';
        return false;
        
    }
    static boolean ifsafe(char [][]board, int r, int c, int n, char num)
    {
        for( int i=0;i<n;i++)
        {
            if(board[i][c]==num || board[r][i]==num)
                return false;}
            int s=r-r%3,f=c-c%3;
            for( int i=0;i<3;i++)
            {
                for( int j=0;j<3;j++){
                if(board[i+s][j+f]==num)
                    return false;
                }  
            }
        return true;
        
    }
}