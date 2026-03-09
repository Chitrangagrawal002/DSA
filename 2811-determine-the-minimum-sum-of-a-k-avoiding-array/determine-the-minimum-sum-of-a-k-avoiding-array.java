class Solution {
    public int minimumSum(int n, int k) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        int i = 1;
        while(n > 0){
            if(!set.contains(k - i)){
                sum += i;
                set.add(i);
                n--;
            }
            i++;
        }
        return sum;
    }
}