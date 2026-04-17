class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int x = nums[i];
            if(map.containsKey(x)){
                ans = Math.min(ans, i - map.get(x));
            }
            map.put(reverse(x), i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public int reverse(int x){
        int y = 0;
        while(x > 0){
            y = y * 10 + (x % 10);
            x /= 10;
        }
        return y;
    }
}