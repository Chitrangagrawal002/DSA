class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for(List<Integer> list : map.values()){
            if(list.size() < 3) continue;
            for(int i = 0; i <= list.size() - 3; i++){
                ans = Math.min(ans, list.get(i + 2) - list.get(i));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : 2 * ans;
    }
}