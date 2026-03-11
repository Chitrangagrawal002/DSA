class Solution {
    public String multiply(String num1, String num2) {
        char[] s1 = new StringBuilder(String.valueOf(num1)).reverse().toString().toCharArray();
        char[] s2 = new StringBuilder(String.valueOf(num2)).reverse().toString().toCharArray();
        int[] res = new int[s1.length + s2.length];

        for(int i = 0; i < s1.length; i++){
            int carry = 0;
            int start = i;
            for(int j = 0; j < s2.length; j++){
                int n1 = s1[i] - '0';
                int n2 = s2[j] - '0';

                int sum = (n1*n2) + res[start] + carry;
                res[start++] = sum % 10;
                carry = sum / 10;
            }
            if(carry != 0) res[start] = carry;
        }
        
        int i = res.length - 1;
        while(i > 0 && res[i] == 0) i--;

        StringBuilder result = new StringBuilder();
        while(i >= 0) result.append(res[i--]);

        return result.toString();
    }
}