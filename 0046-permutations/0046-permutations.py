class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = []
        self._permute_helper(nums, 0, len(nums), result)
        return result

    def _permute_helper(self, nums, start, n, result):
        if start == n - 1:
            result.append(nums[:])  
            return
        
        for i in range(start, n):
            self._swap(nums, start, i)
            self._permute_helper(nums, start + 1, n, result)
            self._swap(nums, start, i)

    def _swap(self, nums, i, j):
        nums[i], nums[j] = nums[j], nums[i]
