class Solution:
    def find(self,nums,fix,res):
        if fix==len(nums)-1:
            res.append(nums[ : ])
            return
        for i in range(fix,len( nums)):
            nums[i], nums[fix]=nums[fix],nums[i]
            self.find(nums, fix+1,res)
            nums[i], nums[fix]=nums[fix],nums[i]

    def permute(self, nums: List[int]) -> List[List[int]]:
        res=[]
        self.find(nums,0,res)
        return res

        