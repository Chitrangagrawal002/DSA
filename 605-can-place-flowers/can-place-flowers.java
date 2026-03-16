class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int k) {
        int n = flowerbed.length;
        for(int i = 0; i < n && k > 0; i++){
            if(flowerbed[i] == 0){
                boolean prev = (i == 0) || (flowerbed[i - 1] == 0);
                boolean next = (i == n - 1) || (flowerbed[i + 1] == 0);
                if(prev && next){
                    k--;
                    flowerbed[i] = 1;
                }
            }
        }
        return k == 0;
    }
}