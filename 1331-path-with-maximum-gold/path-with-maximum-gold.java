class Solution {
    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max_ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 0) continue;
                max_ans = Math.max(max_ans, helper(grid, i, j));
            }
        }
        return max_ans;
    }
    public int helper(int[][] grid, int i, int j){
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == 0){
            return 0;
        }
        int orig = grid[i][j];
        grid[i][j] = 0;
        int left = helper(grid , i, j - 1) + orig;
        int right = helper(grid, i + 1, j) + orig;
        int up = helper(grid, i - 1, j) + orig;
        int down = helper(grid, i, j + 1) + orig;
        grid[i][j] = orig;
        return Math.max(left , Math.max(right, Math.max(up, down)));
    }
}