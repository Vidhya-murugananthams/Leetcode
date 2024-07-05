class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=0;;
        for( int num:nums)
        {
            if(k<=1 || num >nums[k-2])
            nums[k++]=num;

        }
        return k;

    }
}