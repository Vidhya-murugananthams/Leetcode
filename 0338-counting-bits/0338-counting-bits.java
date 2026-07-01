class Solution {
    public int[] countBits(int n) {
        
        int count[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int m=i,c=0;
            while (m>0)
            {
                c+=m%2;
                m=m/2;
            }
            count[i]=c;
                    }
                    return count;
    }
    
}