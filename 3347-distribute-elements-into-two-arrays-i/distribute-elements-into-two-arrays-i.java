class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int arr1[] = new int[n + 1];
        int arr2[] = new int[n + 1];
        arr1[i] = nums[0];
        i++;
        arr2[j] = nums[1];
        j++;
        for(int z = 2; z < n; z++){
            if(arr1[i - 1] > arr2[j - 1]){
                arr1[i++] = nums[z];
            }
            else{
                arr2[j++] = nums[z];
            }
        }
        int res[] = new int[n];
        int k = 0;
        for(int x = 0; x < i; x++){
            res[k++] = arr1[x];
        }
        for(int x = 0; x < j; x++){
            res[k++] = arr2[x];
        }
        return res;
    }
}