class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        ans = []

        for i in nums:
            large = 0
            for j in nums:
                if i>j:
                    large+=1
            ans.append(large)

        return ans