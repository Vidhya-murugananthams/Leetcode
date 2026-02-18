class Solution:
    
    def combinationSum(self, candidates, target):
        self.result = []
        self.temp = []
        self.comb(candidates, target, 0)
        return self.result
    
    def comb(self, nums, target, index):
        if target == 0:
            self.result.append(self.temp[:])
            return
        
        for i in range(index, len(nums)):
            if nums[i] > target:
                continue
            
            self.temp.append(nums[i])
            self.comb(nums, target - nums[i], i)   # same i (can reuse element)
            self.temp.pop()   # backtracking
