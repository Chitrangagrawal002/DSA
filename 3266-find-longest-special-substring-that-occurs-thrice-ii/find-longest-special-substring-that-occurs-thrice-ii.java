class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int freq[][] = new int[26][s.length() + 1];
        char prev = s.charAt(0);
        int len = 1;
        freq[s.charAt(0) - 'a'][1]++;
        for (int i = 1; i < n; i++) {
            char curr = s.charAt(i);
            if (curr == prev) {
                len++;
            } else {
                prev = curr;
                len = 1;
            }
            freq[curr - 'a'][len]++;
        }
        int ans = -1;
        for(int i = 0; i < 26; i++){
            for(int j = s.length() - 1; j >= 1; j--){
                freq[i][j] += freq[i][j+1];
                if(freq[i][j] >= 3){
                    ans = Math.max(ans, j);
                }
            }
        }
        return ans;
    }
}