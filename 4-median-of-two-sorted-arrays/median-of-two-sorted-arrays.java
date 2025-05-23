class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1+n2];
        for(int i = 0; i<n1; i++){
            merged[i] = nums1[i];
        }
        for(int i = 0; i<n2; i++){
            merged[n1+i] = nums2[i];
        }

        int n = merged.length;
        Arrays.sort(merged);
        if(n%2==0){
            return (merged[n/2]+ merged[(n/2)-1])/2.0;
        }else{
            return merged[n/2];
        }
    }
}