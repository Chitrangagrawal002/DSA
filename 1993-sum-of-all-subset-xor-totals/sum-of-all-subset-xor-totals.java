class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
    public int helper(int[] nums, int i, int xor){
        if(i == nums.length){
            return xor;
        }
        int pick = helper(nums, i + 1, (xor ^ nums[i]));
        int notpick = helper(nums, i + 1, xor);
        return pick + notpick;
    }
}