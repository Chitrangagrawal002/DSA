class Solution {
    int mod = 1_000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];
            for (int z = l; z <= r; z += k) {
                nums[z] = (int)((long) nums[z] * v % mod);
            }
        }
        int ans = 0;
        for(int x : nums){
            ans ^= x;
        }
        return ans;
    }
}