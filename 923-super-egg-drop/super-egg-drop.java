class Solution {
    public int superEggDrop(int k, int n) {
        int[] dp = new int[k+1];
        int cnt = 0;
        while(dp[k] < n){
            cnt++;
            for(int i=k; i>=1; i--){
                dp[i] += dp[i-1] + 1;
            }
        }
        return cnt;
    }
}