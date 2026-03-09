class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String map[] = new String[Arrays.stream(heights).max().getAsInt() + 1];
        int n = names.length;
        for(int i = 0; i < n; i++){
            map[heights[i]] = names[i];
        }
        String ans[] = new String[n];
        int k = 0;
        for(int i = map.length - 1; i >= 0; i--){
            if(map[i] != null){
                ans[k++] = map[i];
            }
        }
        return ans;
    }
}