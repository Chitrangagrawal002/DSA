class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int ans = 1;
        while(ans <= n){
            ans <<= 1;
        }
        return (ans - 1) ^ n;
    }
}