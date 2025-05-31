class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> check = new ArrayList<>();

        // First, add elements of arr1 that appear in arr2, in arr2's order
        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == num) {
                    check.add(arr1[j]);
                }
            }
        }

        // Then, add remaining elements from arr1 (not in arr2)
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int k = 0; k < arr2.length; k++) {
                if (arr1[i] == arr2[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                check.add(arr1[i]);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[check.size()];
        for (int i = 0; i < check.size(); i++) {
            result[i] = check.get(i);
        }

        return result;
    }
}
