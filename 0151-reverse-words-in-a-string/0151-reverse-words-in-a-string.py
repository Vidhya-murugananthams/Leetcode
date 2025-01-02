class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.strip().split()
        temp=""
        for i in words[: :-1]:
            temp+=i+" "
        return temp.strip()