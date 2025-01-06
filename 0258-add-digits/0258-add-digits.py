class Solution:
    def addDigits(self, num: int) -> int:
        a=list(map(int,str(num)))
        if len(a)==1:
            return a[0]

        while len(a)>1:
            cnt=sum(a)
            a.clear()
            a=list(map(int,str(cnt)))
        return cnt
        