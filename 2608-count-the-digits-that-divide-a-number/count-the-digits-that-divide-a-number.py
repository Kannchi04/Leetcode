class Solution:
    def countDigits(self, num: int) -> int:
        digit = num
        count =0
        while digit!=0:
            nums = digit%10
            if nums!=0:
                if num%nums==0:
                    count+=1
            digit//=10
        return count