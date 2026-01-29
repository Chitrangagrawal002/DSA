class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int res[] = new int[n];
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.add(i);
        }
        int i = 0;
        while(!q.isEmpty()){
            int x = q.poll();
            res[x] = deck[i];
            i++;
            if (!q.isEmpty()) {
                q.add(q.poll());
            }
        }
        return res;
    }
}