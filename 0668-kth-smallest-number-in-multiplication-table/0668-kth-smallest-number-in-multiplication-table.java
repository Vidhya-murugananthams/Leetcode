class Solution {
    public int findKthNumber(int m, int n, int k) {
        int mm =Math.min(m,n);
        int nn = Math.max(m,n);
        int low = 1;
        int high = n*m;

        while(low< high){

            int mid = low + (high-low)/2;
            if(count(mid,mm,nn,k)){
                high = mid;
            }
            else{

                low = mid+1;
            }
        }
        return low;
    }

    public boolean count(int val,int m,int n,int k){
        int cnt = 0;
        for(int i = 1;i<=m;i++){
            cnt+= Math.min(val/i,n); 
            if(cnt >= k){
                return true;
            }
        }
        return false;
    }
}