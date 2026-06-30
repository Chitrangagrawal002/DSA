class Solution {
    public int numberOfSubstrings(String s) {
        int len = s.length();
        int freq[] = new int[3];
        int ans = 0;
        int i = 0, j = 0;
        while(j < len && i < len && i <= j){
            char ch = s.charAt(j);
            freq[ch - 'a']++;
            while(hasallthree(freq)){
                ans+=len-j;
                char x = s.charAt(i);
                freq[x - 'a']--;
                i++;
            }
            j++;
        }
        return ans;
    }
    public boolean hasallthree(int[] freq){
        return freq[0] > 0 && freq[1] > 0 && freq[2] > 0;
    }
}