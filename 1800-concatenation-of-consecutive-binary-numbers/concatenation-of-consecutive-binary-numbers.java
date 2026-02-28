class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1_000_000_007;
        long result = 0;
        int digit = 0;
        for(int num = 1; num <= n; num++){
            if((num & (num - 1)) == 0){
                digit++;
            }
            result = ((result << digit) % mod + num) % mod;
        }
        return (int)result;
    }
}