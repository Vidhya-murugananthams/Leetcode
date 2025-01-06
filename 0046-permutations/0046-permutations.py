class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result=[]
        self.per(nums,0,len(nums),result) 
        return result
    def per(self,nums,fi,n,result):
        if fi==n-1:
            result.append(nums[:])
        for i in range(fi,n):
            self.swap(fi,i,nums)
            self.per(nums,fi+1,n,result) 
            self.swap(fi,i,nums)
    def swap(self,fi,i,nums):
        nums[fi],nums[i]=nums[i],nums[fi]


