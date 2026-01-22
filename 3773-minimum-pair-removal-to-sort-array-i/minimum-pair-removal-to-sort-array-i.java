class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) list.add(num);
        int ans = 0;
        while(!isSorted(list)){
            int pos = position(list);
            mergePair(list, pos);
            ans++;
        }
        return ans;
    }
    private boolean isSorted(List<Integer> list){
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i + 1)) return false;
        }
        return true;
    }
    public int position(List<Integer> list){
        int minSum = (int)1e9;
        int pos = -1;
        for(int i = 0; i < list.size() - 1; i++){
            int sum = list.get(i) + list.get(i + 1);
            if(sum < minSum){
                minSum = sum;
                pos = i;
            }
        }
        return pos;
    }
    public void mergePair(List<Integer> list, int i){
        list.set(i, list.get(i) + list.get(i + 1));
        list.remove(i + 1);
    }
}