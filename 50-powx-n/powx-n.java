class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long N = n;
        if(N < 0){
            N = -1 * N;
        }
        while(N > 0){
            if((N & 1) == 1){
                ans = (ans * x);
            }
            x = (x * x);
            N >>= 1;
        }
        if(n < 0){
            return (double)(1.0) / (double) (ans);
        }
        return ans;
    }
}