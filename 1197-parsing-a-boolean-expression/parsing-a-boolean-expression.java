class Solution {
    public boolean parseBoolExpr(String expression) {
        int n = expression.length();
        Deque<Character> st = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            char ch = expression.charAt(i);
            if(ch == ',') continue;
            if(ch == ')'){
                boolean hasTrue = false;
                boolean hasFalse = false;
                while(st.peek() != '('){
                    char val = st.pop();
                    if(val == 't') hasTrue = true;
                    if(val == 'f') hasFalse = true;
                }
                st.pop();
                char op = st.pop();
                char res = 'f';
                if(op == '!'){
                    res = hasTrue ? 'f' : 't';
                }
                else if(op == '&'){
                    res = hasFalse ? 'f' : 't';
                }
                else{
                    res = hasTrue ? 't' : 'f';
                }
                st.push(res);
            }
            else{
                st.push(ch);
            }
        }
        return st.peek() == 't';
    }
}