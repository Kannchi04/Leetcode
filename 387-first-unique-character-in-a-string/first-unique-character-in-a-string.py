class Solution:
    def firstUniqChar(self, s: str) -> int:
        dict1 = {}
        n = len(s)
        for i in range(n):
            if s[i] in dict1:
                dict1[s[i]] +=1
            else:
                dict1[s[i]] = 1

        for i in range(n):
            if dict1[s[i]] == 1:
                return i
        
        return -1

            



        