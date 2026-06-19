class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int pref = 0;
        for(int x : gain){
            pref += x;
            ans = Math.max(ans, pref);
        }
        return ans;
    }
}