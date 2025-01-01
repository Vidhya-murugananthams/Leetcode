class Solution:
    def moveZeroes(self,nums:List[int])->None:
        lastNonZeroIndex=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[lastNonZeroIndex]=nums[i]
                lastNonZeroIndex+=1
        for i in range(lastNonZeroIndex,len(nums)):
            nums[i]=0