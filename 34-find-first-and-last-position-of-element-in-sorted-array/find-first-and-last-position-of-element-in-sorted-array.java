class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] result = {-1, -1};
        while(left<=right){
            if(nums[left]==target){
                result[0] = left;
            }else{
                left++;
            }
            if(nums[right]==target){
                result[1] = right;
            }else{
                right--;
            }

            if(result[0]!=-1 && result[1]!=-1){
                break;
            }
        }
        return result;
    }
}