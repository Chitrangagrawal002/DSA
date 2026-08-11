class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int max = Arrays.stream(nums).max().getAsInt();
        int map[] = new int[max + 1];
        int sum = nums[0];
        map[nums[0]] = 1;
        boolean flag = true;
        for(int i = 1; i < n; i++){
            if(flag && nums[i] == nums[i - 1] + 1){
                sum += nums[i];
            }
            else{
                flag = false;
            }
            map[nums[i]]++;
        }
        while(sum <= max && map[sum] != 0){
            sum++;
        }
        return sum;
    }
}