class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int res[][] = new int[n - k + 1][m - k + 1];
        for(int i = 0; i <= n - k; i++){
            for(int j = 0; j <= m - k; j++){
                TreeSet<Integer> set = new TreeSet<>();
                for(int r = i; r <= i + k - 1; r++){
                    for(int c = j; c <= j + k - 1; c++){
                        set.add(grid[r][c]);
                    }
                }
                if(set.size() == 1){
                    continue;
                }
                int min = Integer.MAX_VALUE;
                Integer prev = null;
                for(int val : set){
                    if(prev != null){
                        min = Math.min(min, val - prev);
                    }
                    prev = val;
                }
                res[i][j] = min;
            }
        }
        return res;
    }
}