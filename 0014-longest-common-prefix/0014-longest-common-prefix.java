class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int count=0,flag=0,min=Integer.MAX_VALUE;
        int []arr=new int[n];
        if(n==1)
            return strs[0];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=strs[i].length();
            if(arr[i]==0)
                return "";
            if(min>arr[i])
                min=arr[i];
        }
        for( int i=0;i<min;i++)
        {
            char c=strs[0].charAt(i);
            for( int j=0;j<n;j++)
            {
                if(strs[j].charAt(i)!=c)
                {
                    flag=1;
                    break;
                }
            }
                         

            if(flag==1)
                break;
            count++;
        }
        return strs[0].substring(0,count);
        
    }
}