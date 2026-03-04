class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int row[] = new int[n];
        int col[] = new int[m];
        for(int r = 0; r < n; r++){
            for(int c = 0; c < m; c++){
                if(mat[r][c] == 1){
                    row[r]++;
                    col[c]++;
                }
            }
        }
        int result = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0) continue;
                if(row[i] == 1 && col[j] == 1){
                    result++;
                }
            }
        }
        return result;
    }
}