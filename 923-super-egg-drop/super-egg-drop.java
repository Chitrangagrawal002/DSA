class Solution {
    public int superEggDrop(int k, int n) {
        int dp[][] = new int[k + 1][n + 1];
        int count = 0;
        while(dp[k][count] < n){
            count++;
            for(int i = 1; i <= k; i++){
                dp[i][count] = dp[i - 1][count - 1] + dp[i][count - 1] + 1;
            }
        }
        return count;
    }
}