class Solution:
    def isPalindrome(self, s: str) -> bool:
        # Clean the string by filtering out non-alphanumeric characters and converting to lowercase
        cleaned_string = ''.join(c.lower() for c in s if c.isalnum())

        # Use two pointers to check for palindrome
        l, h = 0, len(cleaned_string) - 1
        while l < h:
            if cleaned_string[l] != cleaned_string[h]:
                return False
            l += 1
            h -= 1
        return True
