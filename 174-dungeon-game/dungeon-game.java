class Solution {
    public int calculateMinimumHP(int[][] mat) {
        Integer dp[][] = new Integer[mat.length][mat[0].length];
        return helper(mat, 0, 0, dp);
    }
    public int helper(int[][] mat, int i, int j, Integer[][] dp){
        if(i == mat.length || j == mat[0].length){
            return Integer.MAX_VALUE;
        }
        if(i == mat.length - 1 && j == mat[0].length - 1){
            return (mat[i][j] <= 0) ? -mat[i][j] + 1 : 1;
        }
        if(dp[i][j] != null) return dp[i][j];
        int right = helper(mat, i, j + 1, dp);
        int down = helper(mat, i + 1, j, dp);
        int min = Math.min(right, down) - mat[i][j];
        dp[i][j] = (min <= 0) ? 1 : min;
        return dp[i][j];
    }
}