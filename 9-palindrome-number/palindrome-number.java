class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int xcopy = x;
        while(x>0){
            int digit = x%10;
            reverse = (reverse*10) + digit;

            x = x/10;
        }

        if(reverse == xcopy){
            return true;
        }else{
            return false;
        }
    }
}