class Solution {
    public long gcd(long a, long b){
        while(b > 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long pref[] = new long[n];
        long max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max , nums[i]);
            pref[i] = gcd(nums[i], max);
        }
        Arrays.sort(pref);
        long sum = 0;
        int l = 0;
        int h = n - 1;
        while(l < h){
            sum += gcd(pref[l], pref[h]);
            l++;
            h--;
        }
        return sum;
    }
}