class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(!stack.isEmpty() && stack.peek() == 'b' && s.charAt(i) == 'a'){
                stack.pop();
                ans++;
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return ans;
    }
}