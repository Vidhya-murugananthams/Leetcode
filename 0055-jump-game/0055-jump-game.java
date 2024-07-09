class Solution {
    public boolean canJump(int[] nums) {
        
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,i+nums[i]);
            if(max<i+1)
                break;
        }
        if(max>=n-1)
            return true;
        else
            return false;
        
    }
}