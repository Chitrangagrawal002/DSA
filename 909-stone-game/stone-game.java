class Solution {
    public boolean stoneGame(int[] piles) {
        int i = 0;
        int j = piles.length - 1;
        int alice = 0;
        int bob = 0;
        while(i < piles.length && j >= 0 && !(alice > bob)){
            if(piles[i] >= piles[j]){
                alice += piles[i];
                bob += piles[j];
                i++;
                j--;
            }
            else if(piles[i] < piles[j]){
                alice += piles[j];
                bob += piles[i];
                i++;
                j--;
            }
        }
        return alice > bob;
    }
}