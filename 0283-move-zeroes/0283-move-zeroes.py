class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        zero_i = 0

        for i, num in enumerate(nums):
            if num != 0:
                nums[zero_i], nums[i] = nums[i], nums[zero_i]
                zero_i += 1