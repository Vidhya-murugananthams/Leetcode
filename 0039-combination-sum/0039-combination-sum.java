class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         TreeSet<Integer> arr=new TreeSet<Integer>();
       	List<List<Integer>>t=new ArrayList<>();
         	ArrayList<Integer>temp=new ArrayList<Integer>();
            ArrayList<Integer>input=new ArrayList<Integer>();
        for(int i=0;i<candidates.length;i++)
	{
	    arr.add(candidates[i]);
	}
    input.addAll(arr);
    comb_sum(input,t,temp,target,0);
    return t;
      }

      public static void comb_sum(ArrayList<Integer> arr,List<List<Integer>> t,ArrayList<Integer> temp, int sum, int index)
  {
    if(sum==0)
    {
    
  t.add(new ArrayList<>(temp));
        return ;
    }
    for(int i=index;i<arr.size();i++)
    {
      if(sum-arr.get(i)>=0)
      {
        temp.add(arr.get(i));
        comb_sum(arr,t,temp,sum-arr.get(i),i);
        temp.remove(temp.size() - 1);
      }}
  }
    
}