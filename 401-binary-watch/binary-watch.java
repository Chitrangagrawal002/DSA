import java.util.*;
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<=11; i++){
            for(int j=0; j<=59; j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn){
                    ans.add(i + ":" + (j < 10 ? "0" + j : j));
                }
            }
        }
        return ans;
    }
}