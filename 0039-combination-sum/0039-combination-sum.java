class Solution {
    private List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result=new ArrayList<List<Integer>>();
     List<Integer> temp=new ArrayList<Integer>();
        comb(candidates,target,0,temp);
        return result;
    }
    public void comb(int []nums, int target, int index,List<Integer>temp)
    {
        if(target==0)
        {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i=index;i<nums.length;i++)
        {
            if(nums[i]>target)
                continue;
            temp.add(nums[i]);
            comb(nums,target-nums[i],i,temp);
            temp.remove(temp.size()-1);
        }
    }
}