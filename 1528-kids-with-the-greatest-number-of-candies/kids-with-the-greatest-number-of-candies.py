class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        list1 = []
        maxNum = max(candies)
        for i in candies:
            candies= i + extraCandies
            if candies<maxNum:
                list1.append(False)
            else:
                list1.append(True)
        return list1
            
