class Solution:
    def addDigits(self, num: int) -> int:#56439
        li=list(map(int,str(num)))# [5 6 4 3 9]
        if len(li)==1:#5==1 f
            return li[0]
        while len(li)>1:# 5>1,2>1,1>1 f
            ans=sum(li)#27, 9
            li.clear()
            li=list(map(int,str(ans)))#[2,7],[9]
        return ans
        
        
        
        