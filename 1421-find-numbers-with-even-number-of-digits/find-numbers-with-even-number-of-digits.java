class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i= 0; i<n;i++){
            int digit = nums[i];
            int number = 0;
            while(digit!=0){
                number++;
                digit/=10;
            }

            if(number%2==0){
                count++;
            }
        }
        return count;
    }
}