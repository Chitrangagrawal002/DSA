class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int max = 0;
        int dp[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                dp[i][j] = matrix[i][j] - '0';
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(dp[i][j] != 0 && isValid(i - 1, j, n, m) && isValid(i, j - 1, n, m) && isValid(i - 1, j - 1, n, m)){
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max * max;
    }
    public boolean isValid(int x, int y, int n, int m){
        return x >= 0 && y >= 0 && x < n && y < m;
    }
}