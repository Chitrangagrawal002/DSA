class Solution {
    long mod = 1_000_000_007;
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int temp[] = nums1.clone();
        Arrays.sort(temp);
        long sum = 0;
        long min = 0;
        for(int i = 0; i < n; i++){
            sum += Math.abs(nums1[i] - nums2[i]);
        }
        min = sum;
        for(int i = 0; i < n; i++){
            int currdiff = Math.abs(nums1[i] - nums2[i]);
            int l = 0;
            int h = n - 1;
            while(l < h){
                int mid = l + (h - l) / 2;
                if(temp[mid] < nums2[i]) l = mid + 1;
                else h = mid;
            }
            int newdiff = Math.min(currdiff, Math.abs(temp[l] - nums2[i]));
            if(l > 0) newdiff = Math.min(newdiff, Math.abs(temp[l - 1] - nums2[i]));
            min = Math.min(min, sum - currdiff + newdiff);
        }
        return (int)(min % mod);
    }
}