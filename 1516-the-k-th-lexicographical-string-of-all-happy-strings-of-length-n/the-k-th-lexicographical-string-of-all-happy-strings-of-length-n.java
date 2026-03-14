class Solution {
    int count = 0;
    String ans = "";
    public String getHappyString(int n, int k) {
        dfs(n, new StringBuilder(), k);
        return ans;
    }
    public void dfs(int n, StringBuilder sb, int k){
        if(n == 0){
            count++;
            if(count == k){
                ans = sb.toString();
            }
            return;
        }
        for(char ch = 'a'; ch < 'd'; ch++){
            if(sb.length() > 0 && ch == sb.charAt(sb.length() - 1)){
                continue;
            }
            dfs(n - 1,sb.append(ch), k);
            if(ans.length() > 0) return;
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}