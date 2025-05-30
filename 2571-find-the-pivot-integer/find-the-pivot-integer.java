class Solution {
    public int pivotInteger(int n) {
        
        // for(int i = 1; i<=n ; i++){
        //     int leftSum = 0;
        //     int rightSum = 0;

        //     for(int j = 1; j<=i;j++){
        //         leftSum += j;
        //     }
        //     for(int k = i; k<=n; k++){
        //         rightSum += k;
        //     }

        //     if(leftSum == rightSum){
        //         return i;
        //     }
        // }
        // return -1;
        int left = 1;
        int right = n;

        if(n==1){
            return 1;
        }

        int leftSum = left;
        int rightSum = right;

        while(right>left){
            if(leftSum < rightSum){
                left++;
                leftSum+=left;
            }else{
                right--;
                rightSum +=right;
            }
            if(rightSum == leftSum && right-1 == left+1){
                return left+1;
            }
        }
        return -1;
    }
}