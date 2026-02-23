class Solution {
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        int max = 0;
        for(int i = 0; i <= n - m; i++) {
            int count = 0;
            int start = i;
            while(start + m <= n && 
                  sequence.substring(start, start + m).equals(word)) {
                count++;
                start += m;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}