class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        Deque<Integer> q = new ArrayDeque<>();
        int idx = 0;
        for(int j = 0; j < n; j++){
            if(!q.isEmpty() && q.peekFirst() <= j - k){
                q.pollFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[j]){
                q.pollLast();
            }
            q.offerLast(j);
            if(j >= k - 1){
                ans[idx++] = nums[q.peekFirst()];
            }
        }
        return ans;
    }
}