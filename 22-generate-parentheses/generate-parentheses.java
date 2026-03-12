class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        sol("", res, n, 0, 0);
        return res;
    }
    public void sol(String sb, List<String> res, int n, int open, int close){
        if(sb.length() == 2*n){
            res.add(sb.toString());
            return;
        }
        if(open < n){
            sol(sb + "(", res, n, open+1, close);
        }
        if(close < open){
            sol(sb + ")", res, n, open, close+1);
        }
    }
}