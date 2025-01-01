class Solution:
    def reverseWords(self, s: str) -> str:
        # Split the string into words, trimming and removing extra spaces
        words = s.strip().split()
        
        # Reverse the words and join them with a single space
        return " ".join(words[::-1])
