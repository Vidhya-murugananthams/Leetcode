class Solution {
    public int[] twoSum(int[] nums, int target) {
       
          int arr[]=new int[2];
          int n=nums.length;
           int t=0;
           HashMap<Integer,Integer> m=new HashMap<>();
           for(int i=0;i<n;i++)
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
