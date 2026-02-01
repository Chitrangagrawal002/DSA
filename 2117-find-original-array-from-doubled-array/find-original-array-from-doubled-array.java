class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n % 2 != 0){
            return new int[0];
        }
        int ans[] = new int[n/2];
        int idx = 0;
        int max = Arrays.stream(changed).max().getAsInt();
        int freq[] = new int[2 * max + 1];
        for(int num : changed){
            freq[num]++;
        }
        for(int i = 0; i <= max; i++){
            if(freq[i] > 0){
                freq[i]--;
                int twice = i * 2;
                if(freq[twice] > 0){
                    freq[twice]--;
                    ans[idx++] = i;
                    i--;
                }
                else{
                    return new int[0];
                }
            }
        }
        return ans;
    }
}