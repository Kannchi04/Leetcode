class Solution {
    public boolean validMountainArray(int[] arr) {
        // 1. Array must have at least 3 elements
        if (arr.length < 3) {
            return false;
        }

        int n = arr.length;
        int i = 0;

        // 2. Walk up the mountain (strictly increasing part)
        // Find the peak: iterate while elements are strictly increasing
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // 3. Peak cannot be the first or last element
        // If i is 0, it means no increasing sequence was found (e.g., [3,2,1])
        // If i is n-1, it means the array is strictly increasing (e.g., [1,2,3,4])
        if (i == 0 || i == n - 1) {
            return false;
        }

        // 4. Walk down the mountain (strictly decreasing part)
        // From the peak, iterate while elements are strictly decreasing
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // 5. Check if we reached the end of the array
        // If 'i' has reached the last element, it means the entire array
        // followed the mountain pattern (increasing then decreasing).
        return i == n - 1;
    }
}