class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    if(isvalid(mat, i, j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public boolean isvalid(int[][] mat, int i, int j){
        for(int k = 0; k < mat.length; k++){
            if(k != i && mat[k][j] == 1) return false;
        }
        for(int k = 0; k < mat[0].length; k++){
            if(k != j && mat[i][k] == 1) return false;
        }
        return true;
    }
}