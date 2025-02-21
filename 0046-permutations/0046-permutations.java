class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        perm(nums,0,list);
        return list;
    }
    public void perm(int[]nums,int fi,List<List<Integer>> list)
    {
        if(fi==nums.length)
        {
            List<Integer> temp=new ArrayList<Integer>();
            for (int i:nums)
                temp.add(i);
            list.add(temp);
            return ;
        }

        for (int i=fi;i<nums.length;i++)
        {
            int t=nums[fi];
            nums[fi]=nums[i];
            nums[i]=t;
            perm(nums,fi+1,list);
             t=nums[fi];
            nums[fi]=nums[i];
            nums[i]=t;

        }
    }

}