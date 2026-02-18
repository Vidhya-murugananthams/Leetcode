class Solution:
    def slove(self,candidates, index, target):
        if target==0:
            self.result.append(self.temp[:])
            return
        for i in range(index,len(candidates)):
            if candidates[i]>target:
                continue
            self.temp.append(candidates[i])
            self.slove(candidates,i,target-candidates[i])
            self.temp.remove(candidates[i])
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        self.result=[]
        self.temp=[]
        self.slove(candidates, 0, target)  
        return self.result      