class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        start = 1
        n = len(nums)

        for i in range(2, n):
            if nums[i]!=nums[start-1]:
                start+=1
                nums[start] = nums[i]

        return start+1


            
        
                    
