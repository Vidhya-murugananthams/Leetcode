class Solution {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);
	    int max=0;int index=0,count = 1,flag =0,n=nums.length;
	    int temp = nums[0], i;
	    for(i=1;i<n;i++){
	        if(nums[i]==temp){
	            count++;}
	        else{
	            temp =nums[i];
	            count =1;}
	        if(max<count){
		    max=count;
	            index = i;
	            if(max>(n/2)){
	              flag =1;
	              break; }}}
	        
	   return nums[index];
	       }
}
