class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int freq[] = new int[26];
        boolean instack[] = new boolean[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        char stack[] = new char[n];
        int top = -1;
        for(char ch : s.toCharArray()){
            int idx = ch - 'a';
            freq[idx]--;
            if(instack[idx]){
                continue;
            }
            while(top >= 0 && stack[top] > ch && freq[stack[top] - 'a'] > 0){
                instack[stack[top] - 'a'] = false;
                top--;
            }
            stack[++top] = ch;
            instack[idx] = true;

        }
        return new String(stack, 0, top + 1);
    }
}