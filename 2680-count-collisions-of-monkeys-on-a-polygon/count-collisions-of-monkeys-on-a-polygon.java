class Solution {
    public int monkeyMove(int n) {
        long ans = 1;
        long base = 2;
        long mod = 1_000_000_007;
        while(n > 0){
            if((n & 1) == 1) ans = (ans * base) % mod;
            base = (base * base) % mod;
            n >>= 1;
        } 
        return (int)((ans - 2 + mod) % mod);
    }
}