class Solution {
    public boolean parseBoolExpr(String expression) {
        int n = expression.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = expression.charAt(i);
            if(ch == ',') continue;
            if(ch == ')'){
                List<Character> curr = new ArrayList<>();
                while(st.peek() != '('){
                    curr.add(st.pop());
                }
                st.pop(); // removing '(' bracket from stack
                char op = st.pop();
                st.push(helper(curr, op));
            }
            else{
                st.push(ch);
            }
        }
        return st.peek() == 't';
    }
    public char helper(List<Character> curr, char op){
        if(op == '!'){
            return curr.get(0) == 't' ? 'f' : 't';
        }
        if(op == '&'){
            for(char ch : curr){
                if(ch == 'f'){
                    return 'f';
                }
            }
            return 't';
        }
        if(op == '|'){
            for(char ch : curr){
                if(ch == 't'){
                    return 't';
                }
            }
            return 'f';
        }
        return 't';
    }
}