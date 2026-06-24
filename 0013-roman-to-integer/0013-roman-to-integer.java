class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int n=s.length();
        char[] arr = s.toCharArray();
        for(int i=n-1;i>=0;i--){
            if(arr[i]=='I'){
                ans+=1;
            }
            else if(arr[i]=='V'){
                if(i==0){
                    ans+=5;
                }
                else if(arr[i-1]=='I'){
                    ans+=5;
                    ans-=1;
                    i--;
                }
                else{
                    ans+=5;
                }
            }
            else if(arr[i]=='X'){
                if(i==0){
                    ans+=10;
                }
                else if(arr[i-1]=='I'){
                    ans+=10;
                    ans-=1;
                    i--;
                }
                else{
                    ans+=10;
                }
            }
            else if(arr[i]=='L'){
                if(i==0){
                    ans+=50;
                }
                else if(arr[i-1]=='X'){
                    ans+=50;
                    ans-=10;
                    i--;
                }
                else{
                    ans+=50;
                }
            }
            else if(arr[i]=='C'){
                if(i==0){
                    ans+=100;
                }
                else if(arr[i-1]=='X'){
                    ans+=100;
                    ans-=10;
                    i--;
                }
                else{
                    ans+=100;
                }
            }
            else if(arr[i]=='D'){
                if(i==0){
                    ans+=500;
                }
                else if(arr[i-1]=='C'){
                    ans+=500;
                    ans-=100;
                    i--;
                }
                else{
                    ans+=500;
                }
            }
            else if(arr[i]=='M'){
                if(i==0){
                    ans+=1000;
                }
                else if(arr[i-1]=='C'){
                    ans+=1000;
                    ans-=100;
                    i--;
                }
                else{
                    ans+=1000;
                }
            }
            else{
                continue;
            }
        }
        return ans;
    }
}