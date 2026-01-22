class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long MOD = 1_000_000_007L;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + nums[i];
        Deque<Integer> st = new ArrayDeque<>();
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            long cur = (i == n ? 0 : nums[i]);
            while (!st.isEmpty() && nums[st.peek()] > cur) {
                int mid = st.pop();
                int left = st.isEmpty() ? 0 : st.peek() + 1;
                int right = i - 1;

                long sum = prefix[right + 1] - prefix[left];
                ans = Math.max(ans, sum * nums[mid]);
            }
            st.push(i);
        }
        return (int)(ans % MOD);
    }
}
