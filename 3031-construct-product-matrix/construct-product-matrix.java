class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int mod = 12345;
        int n = grid.length;
        int m = grid[0].length;
        int[][] res = new int[n][m];
        long pref = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = (int) pref;
                pref = (pref * grid[i][j]) % mod;
            }
        }
        long suff = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                res[i][j] = (int)((res[i][j] * suff) % mod);
                suff = (suff * grid[i][j]) % mod;
            }
        }
        return res;
    }
}