class Solution {
    public int[] sortedSquares(int[] nums) {
        int r[] = new int[nums.length];
        for(int i =0; i < nums.length ; i++){
             r[i] = nums[i] * nums[i];
        }
        Arrays.sort(r);
        return r;
    }
}