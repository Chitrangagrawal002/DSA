class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 && j >= 0){
            if(a.charAt(i) == '1' && b.charAt(j) == '1'){
                if(carry == 1){
                    sb.append('1');
                    carry = 1;
                } 
                else{
                    sb.append('0');
                    carry = 1;
                }
            }
            else if(a.charAt(i) == '1' || b.charAt(j) == '1'){
                if(carry == 1){
                    sb.append('0');
                    carry = 1;
                } 
                else{
                    sb.append('1');
                    carry = 0;
                }
            }
            else{
                if(carry == 1){
                    sb.append('1');
                    carry = 0;
                } 
                else{
                    sb.append('0');
                }
            }
            i--;
            j--;
        }
        while(i >= 0){
            if(a.charAt(i) == '1'){
                if(carry == 1){
                    sb.append('0');
                    carry = 1;
                } 
                else{
                    sb.append('1');
                    carry = 0;
                }
            } 
            else{
                if(carry == 1){
                    sb.append('1');
                    carry = 0;
                } 
                else{
                    sb.append('0');
                }
            }
            i--;
        }
        while(j >= 0){
            if(b.charAt(j) == '1'){
                if(carry == 1){
                    sb.append('0');
                    carry = 1;
                } 
                else{
                    sb.append('1');
                    carry = 0;
                }
            } 
            else{
                if(carry == 1){
                    sb.append('1');
                    carry = 0;
                } 
                else{
                    sb.append('0');
                }
            }
            j--;
        }
        if(carry == 1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
