class Solution
{
    public int nonSpecialCount(int l, int r) 
    {
        int n=(int)Math.sqrt(r);
        boolean[] isprime=new boolean[n+1];
        Arrays.fill(isprime,true);
        int c=0;
        for(int i=2;i<=n;i++)
        {
            if(isprime[i])  
            {
                if(i*i<=r && i*i>=l) c++;
                for(int j=i*i;j<=n;j+=i)
                {
                    isprime[j]=false;
                }
            }
        }
        return r-l+1-c;
    }}
    