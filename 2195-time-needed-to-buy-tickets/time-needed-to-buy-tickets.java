class Pair{
    int ticket;
    boolean person;
    Pair(int ticket, boolean person){
        this.ticket = ticket;
        this.person = person;
    }
}
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Pair> q = new LinkedList<>();
        int n = tickets.length;
        for(int i = 0; i < n; i++){
            q.add(new Pair(tickets[i], (k == i ? true : false)));
        }
        int ans = 0;
        while(!q.isEmpty()){
            Pair pair = q.poll();
            int x = pair.ticket;
            boolean y = pair.person;
            if(y){
                if(x - 1 == 0){
                    return ++ans;
                }
                else{
                    ans++;
                    q.add(new Pair(--x, y));
                }
            }
            else{
                if(x-1 == 0){
                    ans++;
                }
                else{
                    ans++;
                    q.add(new Pair(--x, y));
                }
            }
        }
        return ans;
    }
}