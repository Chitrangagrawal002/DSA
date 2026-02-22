class Solution {
    public int binaryGap(int n) {
        int arr[] = new int[32];
        int idx = 0;
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                arr[idx] = count;
                idx++;
            }
            n >>= 1;
            count++;
        }
        int ans = 0;
        for(int i = 1; i < arr.length; i++){
            ans = Math.max(ans, arr[i] - arr[i - 1]);
        }
        return ans;
    }
}