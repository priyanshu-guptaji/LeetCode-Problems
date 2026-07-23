class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Step 1: Create a frequency array for numbers 0 to 1000
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }
        
        // Step 2: Place elements of arr1 in the order defined by arr2
        int[] ans = new int[arr1.length];
        int i = 0;
        for (int num : arr2) {
            while (count[num] > 0) {
                ans[i++] = num;
                count[num]--;
            }
        }
        
        // Step 3: Place the remaining elements in ascending order
        for (int num = 0; num < count.length; num++) {
            while (count[num] > 0) {
                ans[i++] = num;
                count[num]--;
            }
        }
        
        return ans;
    }
}
