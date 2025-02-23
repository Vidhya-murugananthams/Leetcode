class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>>  result=new ArrayList<List<Integer>>();
     List<Integer> temp=new ArrayList<Integer>();
        comb(candidates,target,0,temp,result);
        return result;
    }
    public void comb(int []nums, int target, int index,List<Integer>temp,List<List<Integer>> result)
    {
        if(target==0)
        {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i=index;i<nums.length;i++)
        {
            if(nums[i]<=target){
            temp.add(nums[i]);
            comb(nums,target-nums[i],i,temp,result);
            temp.remove(temp.size()-1);}
        }
    }
}