class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum = []
        lastSum = 0
        for i in nums:
            lastSum+=i
            sum.append(lastSum)
        
        return sum