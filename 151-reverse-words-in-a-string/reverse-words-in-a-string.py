class Solution:
    def reverseWords(self, s: str) -> str:
        p = s.split()

        ans = ""

        for i in range(len(p)-1, -1, -1):
            if p[i]!=" ":
                ans+=p[i]
            if i != 0:
                ans += " "
        return ans