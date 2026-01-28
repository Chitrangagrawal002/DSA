class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        int count = 0;
        while(!(q.size() == 1)){
            count++;
            if(count == k){
                q.poll();
                count = 0;
            }
            else{
                int x = q.poll();
                q.add(x);
            }
        }
        return q.peek();
    }
}