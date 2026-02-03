class Solution {
    public int largestVariance(String s) {
        int count[] = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a'] = 1;
        }
        int result = 0;
        boolean flag = false;
        for(char i = 'a'; i <= 'z'; i++){
            for(char j = 'a'; j <= 'z'; j++){
                if(count[i - 'a'] == 1 && count[j - 'a'] == 1){
                    int firstcount = 0;
                    int secondcount = 0;
                    for(char ch : s.toCharArray()){
                        if(ch == i){
                            firstcount++;
                        }
                        if(ch == j){
                            secondcount++;
                        }
                        if(secondcount > 0){
                            result = Math.max(result, firstcount - secondcount);
                        }
                        else{
                            if(flag){
                                result = Math.max(result, firstcount - 1);
                            }
                        }
                        if(secondcount > firstcount){
                            firstcount = 0;
                            secondcount = 0;
                            flag = true;
                        }
                    }
                }
            }
        }
        return result;
    }
}