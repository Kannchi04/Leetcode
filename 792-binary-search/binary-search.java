class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(right>=left){
            int m  = (right+left)/2;
            if(target== nums[m]){
                return m;
            }else if(target<nums[m]){
                right = m-1;
            }else{
                left = m+1;
            }
        }
        return -1;
    }
}