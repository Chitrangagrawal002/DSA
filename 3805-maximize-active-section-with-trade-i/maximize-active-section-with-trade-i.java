class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int one = 0;
        List<Integer> l = new ArrayList<>();
        int i = 0;
        while(i < n){
            if(s.charAt(i) == '1'){
                one++;
            }
            if(s.charAt(i) == '0'){
                int start = i;
                while(i < n && s.charAt(i) == '0'){
                    i++;
                }
                l.add(i - start);
            }
            else{
                i++;
            }
        }
        int max = 0;
        for(int j = 1; j < l.size(); j++){
            max = Math.max(max , l.get(j) + l.get(j - 1));
        }
        return max + one;
    }
}