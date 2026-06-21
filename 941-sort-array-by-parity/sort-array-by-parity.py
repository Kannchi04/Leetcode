class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        sorted= []*len(nums)
        for i in nums:
            if i%2 == 0:
                sorted.append(i)
        for i in nums:
            if i%2!=0:
                sorted.append(i)
        return sorted