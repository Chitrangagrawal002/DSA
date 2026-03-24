class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if(!ans.containsKey(str)){
                ans.put(str, new ArrayList<>());
            }
            ans.get(str).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}