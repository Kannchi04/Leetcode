class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPrice = prices[0]
        profit =0
        for i in range(len(prices)):
            currProfit = prices[i] - minPrice
            if currProfit > profit:
                profit = currProfit
            minPrice = min(minPrice, prices[i])

        return profit
