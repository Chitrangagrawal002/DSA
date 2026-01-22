class Solution {
    public int maximizeWin(int[] nums, int k) {
        int n = nums.length;
        int dp[] = new int[n + 1];
        int i = 0;
        int ans = 0;
        for(int j = 0; j < n; j++){
            while(nums[j] - nums[i] > k){
                i++;
            }
            int windowSize = j - i + 1;
            dp[j + 1] = Math.max(dp[j], windowSize);
            ans = Math.max(ans, windowSize + dp[i]);
        }
        return ans;
    }
}