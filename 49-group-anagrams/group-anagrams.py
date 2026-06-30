class Solution:
    def sortString(self, s):
        s = list(s)
        s.sort()
        return "".join(s)
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict1 = {}
        list1 = []
        for i in strs:
            key = self.sortString(i)

            if key in dict1:
                dict1[key].append(i)
            else:
                dict1[key] = [i]

    
        return list(dict1.values())

            

        

        