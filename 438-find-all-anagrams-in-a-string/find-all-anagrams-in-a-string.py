class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        dict1 = {}
        ans = []

        if len(p) > len(s):
            return []
        for i in p:
            if i not in dict1:
                dict1[i] = 1
            else:
                dict1[i] +=1

        dict2 = {}

        for i in range(len(p)):
            if s[i] not in dict2:
                dict2[s[i]] = 1
            else:
                dict2[s[i]] +=1
        
        if dict1 == dict2:
            ans.append(0)

        left = 0

        for right in range(len(p), len(s)):
            dict2[s[left]]-=1

            if dict2[s[left]] ==0:
                del dict2[s[left]]

            if s[right] not in dict2:
                dict2[s[right]] =1
            else:
                dict2[s[right]]+=1
            
            if dict1 == dict2:
                ans.append(left+1)
            
            left+=1

        return ans
        