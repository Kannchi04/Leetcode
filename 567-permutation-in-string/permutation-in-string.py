class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        dict1= {}
        for i in range(len(s1)):
            if s1[i] not in dict1:
                dict1[s1[i]] = 1
            else:
                dict1[s1[i]]+=1
        i = 0
        j = len(s1)-1
        dict2 = {}
        for k in s2[:len(s1)]:
            if k not in dict2:
                dict2[k] = 1
            else:
                dict2[k] +=1
        if dict1 == dict2:
            return True
        left  = 0
        for right in range(len(s1), len(s2)):
            dict2[s2[left]]-=1
            if dict2[s2[left]] == 0:
                del dict2[s2[left]]
            if s2[right] not in dict2:
                dict2[s2[right]] = 1
            else:
                dict2[s2[right]]+=1
            left+=1
            if dict2 == dict1:
                return True

            
        return False

            




