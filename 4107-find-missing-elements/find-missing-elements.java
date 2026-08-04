class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int[] arr = new int[max + 1];
        for(int i : nums){
            arr[i]++;
        }
        for(int i = min; i < max; i++){
            if(arr[i] == 0)
                ans.add(i);
        }
        return ans;
    }
}