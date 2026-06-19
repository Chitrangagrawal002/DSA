class Solution {
    public int numWaterBottles(int b, int e) {
        int ans = 0;
        int empty = 0;
        while(b > 0){
            ans += b;
            empty += b;
            b = empty / e;
            empty = empty % e;
        }
        return ans;
    }
}