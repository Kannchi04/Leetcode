import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 1; i<=nums.length+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 1;
    }
}