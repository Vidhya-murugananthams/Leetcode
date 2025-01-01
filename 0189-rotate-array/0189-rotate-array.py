class Solution:
    def rotate(self, nums, k):
        k %= len(nums)  # Handle cases where k is larger than the array size
        
        # Reverse the entire array
        self.reverse(nums, 0, len(nums) - 1)
        # Reverse the first k elements
        self.reverse(nums, 0, k - 1)
        # Reverse the remaining elements
        self.reverse(nums, k, len(nums) - 1)
    
    def reverse(self, nums, left, right):
        """
        Reverse elements in the array nums between indices left and right.
        """
        while left < right:
            # Swap the elements at left and right indices
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
