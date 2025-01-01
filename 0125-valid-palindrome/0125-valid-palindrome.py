class Solution:
    def isPalindrome(self, s: str) -> bool:
        l, r = 0, len(s) - 1
        
        while l < r:
            lc = s[l]
            rc = s[r]
            
            if not lc.isalnum():  # Check if the left character is alphanumeric
                l += 1
                continue
            if not rc.isalnum():  # Check if the right character is alphanumeric
                r -= 1
                continue
            
            if lc.lower() != rc.lower():  # Compare lowercase versions of the characters
                return False
            
            l += 1
            r -= 1
        
        return True
