class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left<=right){
            int m =(right+left)/2;

            if(nums[m]==target){
                return m;
            }else if(nums[m]>=nums[left]){
                if(nums[left]<= target && target <= nums[m]){
                    right = m-1;
                }else{
                    left = m+1;
                }
            }else{
                if(nums[m]<= target && target <= nums[right]){
                    left = m+1;
                }else{
                    right = m-1;
                }
            }
        }
        return -1;
    }
}