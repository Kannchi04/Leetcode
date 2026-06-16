class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        temp = n
        prod = 1
        sum = 0

        while temp>0:
            digit = temp%10
            prod*=digit
            sum+=digit
            temp//=10
        res = prod - sum
        return res