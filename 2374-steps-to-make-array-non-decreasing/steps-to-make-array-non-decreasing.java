class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int res = 0;
        int stack[] = new int[n];
        int dp[] = new int[n];
        int j = -1;
        for(int i = n - 1; i >= 0; i--){
            while(j >= 0 && nums[i] > nums[stack[j]]){
                dp[i] = Math.max(++dp[i], dp[stack[j--]]);
                res = Math.max(dp[i], res);
            }
            stack[++j] = i;
        }
        return res;
    }
}