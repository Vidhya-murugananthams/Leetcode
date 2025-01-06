class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        # List to store all permutations
        result = []
        # Start the recursive function
        self._permute_helper(nums, 0, len(nums), result)
        return result

    def _permute_helper(self, nums, start, n, result):
        # Base case: If the current index is the last one, add the current permutation
        if start == n - 1:
            result.append(nums[:])  # Append a copy of nums to avoid reference issues
            return
        
        # Recursive case: Generate all permutations
        for i in range(start, n):
            # Swap current index with the iteration index
            self._swap(nums, start, i)
            # Recurse for the next index
            self._permute_helper(nums, start + 1, n, result)
            # Backtrack: Undo the swap
            self._swap(nums, start, i)

    def _swap(self, nums, i, j):
        # Helper function to swap two elements in the list
        nums[i], nums[j] = nums[j], nums[i]
