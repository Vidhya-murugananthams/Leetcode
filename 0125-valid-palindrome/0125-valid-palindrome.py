class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned_string = ""
        for char in s:
            if char.isalnum(): 
                cleaned_string += char.lower()  
        
        l, h = 0, len(cleaned_string) - 1
        while l < h:
            if cleaned_string[l] != cleaned_string[h]: 
                return False
            l += 1  
            h -= 1 
        
        return True  

