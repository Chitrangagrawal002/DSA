class Solution {
    public String smallestSubsequence(String s, int k, char letter, int repetition) {
        int remain = 0;
        for(char ch : s.toCharArray()){
            if(ch == letter){
                remain++;
            }
        }
        Stack<Character> st = new Stack<>();
        int used = 0;
        for(int j = 0; j < s.length(); j++){
            char ch = s.charAt(j);
            if(ch == letter){
                remain--;
            }
            while(!st.isEmpty() && st.peek() > ch){
                if((st.size() - 1) + (s.length() - j) < k){
                    break;
                }
                if(st.peek() == letter){
                    if((used - 1) + remain < repetition){
                        break;
                    }
                    used--;
                }
                st.pop();
            }
            if(st.size() < k){
                if(ch == letter){
                    st.push(ch);
                    used++;
                }
                else{
                    int slots = k - st.size();
                    int needed = repetition - used;
                    if(slots > needed){
                        st.push(ch);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}