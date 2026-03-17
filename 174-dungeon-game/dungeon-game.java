class Solution {
    public int calculateMinimumHP(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dp = new int[n][m];
        dp[n-1][m-1] = (mat[n-1][m-1] <= 0) ? -mat[n-1][m-1] + 1 : 1;
        for(int i = n - 2; i >= 0; i--){
            dp[i][m-1] = Math.max(1, dp[i+1][m-1] - mat[i][m-1]);
        }
        for(int j = m - 2; j >= 0; j--){
            dp[n-1][j] = Math.max(1, dp[n-1][j+1] - mat[n-1][j]);
        }
        for(int i = n - 2; i >= 0; i--){
            for(int j = m - 2; j >= 0; j--){
                int minNext = Math.min(dp[i+1][j], dp[i][j+1]);
                dp[i][j] = Math.max(1, minNext - mat[i][j]);
            }
        }
        return dp[0][0];
    }
}