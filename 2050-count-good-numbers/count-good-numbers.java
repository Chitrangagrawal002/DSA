class Solution {
    long mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        if(n == 1) return 5;
        long even = (n + 1) / 2;
        long odd = n / 2;
        return (int)((helper(5, even) * helper(4, odd)) % mod);
    }
    public long helper(long base, long power){
        long result = 1;
        while(power > 0){
            if((power & 1) == 0){
                base = (base * base) % mod;
                power /= 2;
            }
            else{
                result = (result * base) % mod;
                power -= 1;
            }
        }
        return result;
    }
}