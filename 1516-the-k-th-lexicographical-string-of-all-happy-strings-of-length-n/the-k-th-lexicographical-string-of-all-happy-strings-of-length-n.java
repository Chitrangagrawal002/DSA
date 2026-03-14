class Solution {
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        dfs(n, list, new StringBuilder());
        if(list.size() < k) return "";
        Collections.sort(list);
        return list.get(k - 1);
    }
    public void dfs(int n, List<String> list, StringBuilder sb){
        if(n == 0){
            list.add(sb.toString());
            return;
        }
        for(char ch = 'a'; ch < 'd'; ch++){
            if(sb.length() > 0 && ch == sb.charAt(sb.length() - 1)){
                continue;
            }
            dfs(n - 1, list, sb.append(ch));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}