class Solution:
    def swap(self,i,j,nums):
        t=nums[i]
        nums[i]=nums[j]
        nums[j]=t
    def slove(self, nums,fix,res):
        if fix==len(nums)-1:
            res.append(nums[ : ])
            return
        for i in range(fix,len(nums)):
            self.swap(i,fix,nums)
            self.slove(nums,fix+1,res)
            self.swap(i,fix,nums)
    def permute(self, nums: List[int]) -> List[List[int]]:
        res=[]
        self.slove(nums,0,res)
        return res

        