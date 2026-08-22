class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int num : nums){
            total += num;
        }
        if(total % 2 != 0){
            return false;
        }
        int target = total / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];
        return solve(nums, 0, 0, target, dp);
    }
    public boolean solve(int[] nums, int i, int sum, int target, Boolean[][] dp){
        if(i >= nums.length || sum > target){
            return false;
        }
        if(sum == target){
            return true;
        }
        if(dp[i][sum] != null) return dp[i][sum];
        boolean pick = solve(nums, i + 1, sum + nums[i], target, dp);
        boolean notpick = solve(nums, i + 1, sum, target, dp);
        return dp[i][sum] = pick || notpick;
    }
}