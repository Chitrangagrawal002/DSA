class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int res = 0;
        int freq[] = new int[26];
        for(int i = 0; i < n; i++){
            Arrays.fill(freq, 0);
            for(int j = i; j < n; j++){
                boolean flag = true;
                int curr = s.charAt(j) - 'a';
                freq[curr]++;
                for(int x : freq){
                    if(x > 0 && x != freq[curr]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    res = Math.max(res, (j-i+1));
                }
            }
        }
        return res;
    }
}