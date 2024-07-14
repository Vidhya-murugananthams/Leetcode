class Solution {
    public long minimumPerimeter(long neededApples) {
    
	long cnt=0,sum=0;
	while(sum<neededApples){//0<12
	cnt++;//1
	        sum+=(12*cnt*cnt);//sum=12
	    }
	return 8*cnt;
	}   
    }
