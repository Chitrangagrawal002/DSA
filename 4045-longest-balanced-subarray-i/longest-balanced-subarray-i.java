class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();
            int ecnt = 0;
            int ocnt = 0;
            for(int j = i; j < n; j++){
                if(nums[j] % 2 == 0){
                    if(!even.contains(nums[j])){
                        even.add(nums[j]);
                        ecnt++;
                    }
                }
                else{
                    if(!odd.contains(nums[j])){
                        odd.add(nums[j]);
                        ocnt++;
                    }
                }
                if(ecnt == ocnt){
                    ans = Math.max(ans, (j-i+1));
                }
            }
        }
        return ans;
    }
}