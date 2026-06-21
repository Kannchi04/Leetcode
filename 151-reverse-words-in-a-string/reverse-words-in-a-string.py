class Solution:
    def reverseWords(self, s: str) -> str:
        p = s.split()
        ans= p[::-1]

        return ' '.join(ans)