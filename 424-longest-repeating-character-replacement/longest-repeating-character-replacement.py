class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        dict1 = {}
        for right in range(len(s)):
            
            if s[right] in dict1:
                dict1[s[right]]+=1
            else:
                dict1[s[right]]= 1
            if  right - left+ 1 - max(dict1.values())>k:
                dict1[s[left]] -=1
                if dict1[s[left]] == 0:
                    del dict1[s[left]]
                left+=1
            
        return right-left+1
            

                
            
        