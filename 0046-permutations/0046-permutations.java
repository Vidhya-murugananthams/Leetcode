class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> l=new ArrayList<>(); 
        perm( l,nums,0,nums.length);
        return l;
    }
    void perm(List<List<Integer>> l, int nums[], int fi, int n)
    {
        if(fi==n-1)
        {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            l.add(currentPermutation);
            return;
        }
        for( int i=fi;i<n;i++)
        {
            swap(nums,fi,i);
            perm(l,nums,fi+1,n);
            swap(nums,fi,i);
        }
    }
    void swap( int [] nums, int fi,int i)
    {
        int t=nums[i];
        nums[i]=nums[fi];
        nums[fi]=t;
    }
}