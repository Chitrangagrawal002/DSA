class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        int n = s.length();
        int index = 0, curr = 1;
        List<Character>[] list = new ArrayList[numRows];
        for(int i=0; i<numRows; i++){
            list[i] = new ArrayList<>();
        }
        for(char ch : s.toCharArray()){
            list[index].add(ch);
            if(index == 0){
                curr = 1;
            }
            else if(index == numRows - 1){
                curr = -1;
            }
            index += curr;
        }
        StringBuilder sb = new StringBuilder();
        for(List<Character> row : list){
            for(char ch : row){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}