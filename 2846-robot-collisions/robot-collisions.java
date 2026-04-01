class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer idx[] = new Integer[n];
        for(int i = 0; i < n; i++){
            idx[i] = i;
        }
        ArrayDeque<Integer> st = new ArrayDeque<>();
        Arrays.sort(idx, (a,b) -> Integer.compare(positions[a], positions[b]));
        List<Integer> ans = new ArrayList<>();
        for(int currIdx : idx){
            if(directions.charAt(currIdx) == 'R'){
                st.push(currIdx);
            }
            else{
                while(!st.isEmpty() && healths[currIdx] > 0){
                    int top = st.pop();
                    if(healths[top] > healths[currIdx]){
                        healths[top] -= 1;
                        healths[currIdx] = 0;
                        st.push(top);
                    }
                    else if(healths[top] < healths[currIdx]){
                        healths[top] = 0;
                        healths[currIdx] -= 1;
                    }
                    else{
                        healths[top] = 0;
                        healths[currIdx] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(healths[i] > 0){
                ans.add(healths[i]);
            }
        }
        return ans;
    }
}