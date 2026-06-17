class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        sums = []
        for i in accounts:
            sum = 0
            for j in i:
                sum+=j
            sums.append(sum)
        return max(sums)