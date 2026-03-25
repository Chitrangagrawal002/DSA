class Solution {
    public int twoEggDrop(int n) {
        int k = 2;
        int dp[] = new int[3];
        int count = 0;
        while(dp[k] < n){
            count++;
            for(int i = 2; i > 0; i--){
                dp[i] += dp[i - 1] + 1;
            }
        }
        return count;
    }
}