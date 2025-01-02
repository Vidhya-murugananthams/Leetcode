class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numMap={}
        for i in range(len(nums)):
            t=target-nums[i]
            if t in numMap:
                return [numMap[t],i]
            numMap[nums[i]]=i
        return []

        