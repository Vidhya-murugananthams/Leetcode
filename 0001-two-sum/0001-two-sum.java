class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m=new HashMap<>();
        int arr[]=new int[2];
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            t=target-nums[i];
            if(m.containsKey(t))
                {
                    arr[0]=m.get(t);
                    arr[1]=i;
                    return arr;
                }
                m.put(nums[i],i);
        }
        return arr;
    }
}
