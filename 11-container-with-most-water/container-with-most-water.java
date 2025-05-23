import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        //ArrayList<Integer> area = new ArrayList<>();
        // for(int i = 0; i<height.length; i++){
        //     for(int j = i+1; j<height.length; j++){
        //         if(height[j]<height[i]){
        //             area.add(height[j]*(j-i));
        //         }else{
        //             area.add(height[i]*(j-i));
        //         }
        //     }
        // }
        // int maxArea = Collections.max(area);
        // return maxArea;

        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        while(left<right){
            int currentHeight = Math.min(height[left], height[right]);

            int currentArea = currentHeight * (right-left);

            maxWater = Math.max(maxWater, currentArea);

            if (height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}