class Solution:
    def isPalindrome(self, x: int) -> bool:
        num = 0
        temp = x
        if x<0:
            return False
        else:
            while temp>0:
                digit = temp%10
                num = num*10+digit
                temp//=10
            if x == num:
                return True
            else:
                return False
                