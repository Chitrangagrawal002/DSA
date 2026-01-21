class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int reversed = 0;
        while (reversed < x) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return reversed == x || x == (reversed / 10);
    }
}