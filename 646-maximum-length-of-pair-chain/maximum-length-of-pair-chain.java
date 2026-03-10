class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a,b) ->a[1] - b[1]);
        int prev[] = pairs[0];
        int count = 1;
        for(int i = 1; i < n; i++){
            if(pairs[i][0] > prev[1]){
                count++;
                prev = pairs[i];
            }
        }
        return count;
    }
}