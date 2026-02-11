class Solution {
    public String maxValue(String n, int x) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        char ch = (char)(x + '0');
        if (n.charAt(0) == '-') {
            sb.append('-');
            for (int i = 1; i < n.length(); i++) {
                if (!flag && n.charAt(i) - '0' > x) {
                    sb.append(ch);
                    flag = true;
                }
                sb.append(n.charAt(i));
            }
        } else {
            for (int i = 0; i < n.length(); i++) {
                if (!flag && n.charAt(i) - '0' < x) {
                    sb.append(ch);
                    flag = true;
                }
                sb.append(n.charAt(i));
            }
        }
        if (!flag) sb.append(ch);
        return sb.toString();
    }
}