import java.util.*;
class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int allsum= n*(n+1)/2;
        int actualsum = 0;
        int res = 0;
        for(int i = 0; i<arr.length; i++){
            actualsum += arr[i];
            if(arr[i] != allsum){
                res = allsum-actualsum;
            }
        }
    return res;
    }
}