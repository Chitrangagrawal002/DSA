class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for(List<String> ls : knowledge){
            map.put(ls.get(0), ls.get(1));
        }
        boolean flag = false;
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                flag = true;
            }
            else if(ch == ')'){
                if(map.containsKey(temp.toString())){
                    ans.append(map.get(temp.toString()));
                }
                else{
                    ans.append('?');
                }
                flag = false;
                temp.setLength(0);
            }
            else if(flag){
                temp.append(ch);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}