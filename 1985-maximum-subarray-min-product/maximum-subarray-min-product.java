class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long mod = 1_000_000_007;
        long prefix[] = new long[nums.length + 1];
        int pse[] = new int[n];
        int nse[] = new int[n];
        for(int i=0; i<n; i++){
            prefix[i+1] = prefix[i] + nums[i];
        }
        Stack<Integer> st = new Stack<>();
        Arrays.fill(pse, -1);
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        Arrays.fill(nse, n);
        for(int i=n-1; i>=0 ; i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        long ans = 0;
        for(int i=0; i<n; i++){
            int left = pse[i] + 1;
            int right = nse[i] - 1;
            long sum = prefix[right + 1] - prefix[left];
            long product = sum * nums[i];
            ans = Math.max(ans, product);
        }
        return (int)(ans % mod);
    }
}