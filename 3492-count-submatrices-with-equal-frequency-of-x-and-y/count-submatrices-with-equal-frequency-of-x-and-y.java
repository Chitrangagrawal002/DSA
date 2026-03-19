class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int currSumX[][] = new int[n][m];
        int currSumY[][] = new int[n][m];
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                currSumX[i][j] = (grid[i][j] == 'X') ? 1 : 0;
                currSumY[i][j] = (grid[i][j] == 'Y') ? 1 : 0;
                if(i - 1 >= 0){
                    currSumX[i][j] += currSumX[i - 1][j];
                    currSumY[i][j] += currSumY[i - 1][j];
                }
                if(j - 1 >= 0){
                    currSumX[i][j] += currSumX[i][j - 1];
                    currSumY[i][j] += currSumY[i][j - 1];
                }
                if(i - 1 >= 0 && j - 1 >= 0){
                    currSumX[i][j] -= currSumX[i - 1][j - 1];
                    currSumY[i][j] -= currSumY[i - 1][j - 1];
                }
                if(currSumX[i][j] == currSumY[i][j] && currSumX[i][j] > 0){
                    count++;
                }
            }
        }
        return count;
    }
}