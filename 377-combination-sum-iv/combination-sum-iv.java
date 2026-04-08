class Solution {
    Integer dp[];
    public int combinationSum4(int[] nums, int target) {
        dp = new Integer[target + 1];
        return helper(nums, target);
    }
    public int helper(int[] nums, int target){
        if(target == 0) return 1;
        if(target < 0) return 0;
        if(dp[target] != null) return dp[target];
        int count = 0;
        for(int num : nums){
            count += helper(nums, target - num);
        }
        return dp[target] = count;
    }
}