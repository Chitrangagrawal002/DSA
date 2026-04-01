class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int asteroid : asteroids){
            boolean blast = false;
            while(!st.isEmpty() && asteroid < 0 && st.peek() > 0){
                if(st.peek() < -(asteroid)){
                    st.pop();
                }
                else if(st.peek() == (-1 * asteroid)){
                    st.pop();
                    blast = true;
                    break;
                }
                else{
                    blast = true;
                    break;
                }
            }
            if(!blast){
                st.push(asteroid);
            }
        }
        int ans[] = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}