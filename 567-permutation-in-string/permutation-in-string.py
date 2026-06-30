class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        dict1= {}
        for i in range(len(s1)):
            if s1[i] not in dict1:
                dict1[s1[i]] = 1
            else:
                dict1[s1[i]]+=1

        j = len(s1)-1
        i =0

        while j<len(s2):
            sub = s2[i:j+1]
            dict2 = {}
            for k in sub:
                if k not in dict2:
                    dict2[k] = 1
                else:
                    dict2[k] +=1
                
            if dict1 == dict2:
                return True
            j+=1
            i+=1
        return False

            




