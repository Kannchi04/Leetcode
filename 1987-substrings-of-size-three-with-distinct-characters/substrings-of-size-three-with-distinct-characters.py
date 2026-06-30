class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        i = 0
        count = 0
        while i <= len(s) - 2:
            sub = s[i:i+3]

            for j in range(1, len(sub)-1):
                if len(set(sub)) == 3:
                    count += 1
            i+=1

        return count
