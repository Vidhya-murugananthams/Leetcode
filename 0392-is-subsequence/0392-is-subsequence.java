class Solution {
    public boolean isSubsequence(String s, String t) {
      int n=s.length();
      int m=t.length();
    if(n==0)
        return true;
    if(m==0 && n!=0)
        return false;
    int count=0;
    for(int i=0;i<m;i++)
    {
        if(t.charAt(i)==s.charAt(count))
            count++;
        if(count==n)
        {
            return true;
        }
    }
    return false;
      
    }
}