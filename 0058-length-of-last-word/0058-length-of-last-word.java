class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1,count=0;
        while(s.charAt(n)==' ')
        {
            n--;
        }
            
        
        for(int i=n;i>=0;i--)
        {
            if(s.charAt(i)==' ')
                break;
            count++;
            
                
        }
        return count;
    }
}