class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        int n = num.length();

        for(int i = 0; i < n; i++){

            while(sb.length() > 0 && sb.charAt(sb.length() - 1) > num.charAt(i) && k > 0){
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }

            if(sb.length() > 0 || num.charAt(i) != '0'){
                sb.append(num.charAt(i));
            }
        }

        while(sb.length() > 0 && k > 0){
            sb.setLength(sb.length() - 1);
            k--;
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}