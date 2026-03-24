class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append(freq[i]).append('#');
            }
            String k = key.toString();
            map.putIfAbsent(k, new ArrayList<>());
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}