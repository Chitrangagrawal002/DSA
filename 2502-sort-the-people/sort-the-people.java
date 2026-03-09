class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new int[]{heights[i], i});
        }
        list.sort((a, b) -> b[0] - a[0]);
        String[] ans = new String[n];
        for(int i = 0; i < n; i++){
            ans[i] = names[list.get(i)[1]];
        }
        return ans;
    }
}