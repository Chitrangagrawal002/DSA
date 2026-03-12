class Solution {
    public boolean checkValidString(String s) {
        int minopen = 0;
        int maxopen = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '('){
                minopen++;
                maxopen++;
            }
            else if(ch == ')'){
                minopen--;
                maxopen--;
            }
            else{
                minopen--;
                maxopen++;
            }
            if(maxopen < 0){
                return false;
            }
            if(minopen < 0) minopen = 0;
        }
        return minopen == 0;
    }
}