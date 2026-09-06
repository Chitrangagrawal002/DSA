class Solution {
    long dp[][];
    public int numDistinct(String s, String t) {
        dp = new long[s.length()][t.length()];
        for(long[] row : dp){
            Arrays.fill(row, -1);
        }
        return (int) solve(s, t, 0, 0);
    }
    public long solve(String s, String t, int i, int j){
        if(j == t.length()){
            return 1;
        }
        if(i == s.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        long ans = 0;
        if(s.charAt(i) == t.charAt(j)){
            ans += solve(s, t, i + 1, j + 1);
        }
        ans += solve(s, t, i + 1, j);
        return dp[i][j] = ans;
    }
}