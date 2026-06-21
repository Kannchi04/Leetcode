class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        maxWealth = []
        for i in accounts:
            sum =0
            for j in i:
                sum+=j
                maxWealth.append(sum)
        
        return max(maxWealth)

