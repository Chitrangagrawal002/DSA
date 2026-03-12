class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> list = new ArrayList<>();
        backtrack(map, digits, list, 0, new StringBuilder());
        return list;
    }
    public void backtrack(Map<Character, String> map, String digits, List<String> list, int i, StringBuilder sb){
        if(i == digits.length()){
            list.add(sb.toString());
            return;
        }
        String curr = map.get(digits.charAt(i));
        for(char ch : curr.toCharArray()){
            sb.append(ch);
            backtrack(map, digits, list, i+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}