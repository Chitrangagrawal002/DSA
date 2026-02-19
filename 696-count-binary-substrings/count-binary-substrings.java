class Solution {
    public int countBinarySubstrings(String s) {
        int freq[] = new int[s.length()];
        int idx = 0;
        freq[0] = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i - 1)){
                freq[++idx] = 1;
            }
            else{
                freq[idx]++;
            }
        }
        int ans = 0;
        for(int i = 1; i < freq.length; i++){
            ans += Math.min(freq[i], freq[i - 1]);
        }
        return ans;
    }
}