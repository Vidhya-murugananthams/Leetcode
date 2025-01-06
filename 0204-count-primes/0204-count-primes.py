import math
class Solution:
    def countPrimes(self, n: int) -> int:
        prime=[1]*n
        count=0
        for i in range(2,int(math.sqrt(n))+1):
            if prime[i]==1:
                for j in range(i*i,n,i):
                    prime[j]=0
        for i in range(2,n):
            if prime[i]==1:
                count+=1
        return count

            


        