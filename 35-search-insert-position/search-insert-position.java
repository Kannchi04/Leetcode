class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        // for(int i = 0; i<nums.length;i++){
        //     if(nums[i]== target){
        //         result = i;
        //         break;
        //     }
        // }
        // if(result== 0){
        //     for(int i = 0; i<nums.length;i++){
        //         if(nums[i]> target){
        //             result = i-2;
        //         }else{
        //             if(target>nums[nums.length-1]){
        //                 result = nums.length;
        //             }
        //         }
        //     }
        // }
        // return result;

        int left = 0;
        int right = nums.length-1;

        

        while(left<=right){
            int m = left+(right-left)/2;
            if(target==nums[m]){
                return m;
            }else if(target<nums[m]){
                right = m-1;
            }else{
                left = m+1;
            }
        }
        return left;
    }
}