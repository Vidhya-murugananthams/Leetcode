class Solution {
    private List<List<Integer>> result;
    private List<Integer> temp;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result=new ArrayList<List<Integer>>();
        temp=new ArrayList<Integer>();
        comb(candidates,target,0);
        return result;
    }
    public void comb(int []nums, int target, int index)
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
            comb(nums,target-nums[i],i);
            temp.remove(temp.size()-1);
        }
    }
}