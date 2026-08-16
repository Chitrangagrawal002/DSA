class Solution {
    public int rob(int[] nums) {
        Integer dp[] = new Integer[nums.length];
        return solve(nums, 0, dp);
    }
    public int solve(int[] nums, int i, Integer[] dp){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i] != null){
            return dp[i];
        }
        int pick = nums[i] + solve(nums, i + 2, dp);
        int notpick = solve(nums, i + 1, dp);
        return dp[i] = Math.max(pick, notpick);
    }
}