class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0;
        int n = plants.length;
        int cap = capacity;
        for(int i = 0; i < n; i++){
            if(cap < plants[i]){
                ans += 2 * i + 1;
                cap = capacity - plants[i];
            }
            else{
                cap -= plants[i];
                ans++;
            }
        }
        return ans;
    }
}