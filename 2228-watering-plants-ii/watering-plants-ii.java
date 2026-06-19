class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i = 0, j = plants.length - 1;
        int alice = capacityA, bob = capacityB;
        int ans = 0;
        while(i < j){
            if(alice < plants[i]){
                ans++;
                alice = capacityA;
            }
            alice -= plants[i];
            i++;
            if(bob < plants[j]){
                ans++;
                bob = capacityB;
            }
            bob -= plants[j];
            j--;
        }
        if(i == j){
            int max = Math.max(alice, bob);
            if(max < plants[i]){
                ans++;
            }
        }
        return ans;
    }
}