class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int dp[] = new int[n];
        Arrays.fill(dp , 1);
        int max = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(pairs[i][0] > pairs[j][1] && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}