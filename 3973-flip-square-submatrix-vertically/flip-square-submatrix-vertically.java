class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int i = x;
        int j = x + k - 1;
        while(i < j){
            for(int z = y; z < y + k; z++){
                int temp = grid[i][z];
                grid[i][z] = grid[j][z];
                grid[j][z] = temp;
            }
            i++;
            j--;
        }
        return grid;
    }
}