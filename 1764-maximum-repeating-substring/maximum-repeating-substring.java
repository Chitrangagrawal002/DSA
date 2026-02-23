class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans = 0;
        String curr = word;
        while(sequence.contains(curr)){
            ans++;
            curr += word;
        }
        return ans;
    }
}