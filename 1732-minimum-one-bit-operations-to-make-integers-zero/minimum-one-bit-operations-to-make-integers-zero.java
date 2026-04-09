class Solution {
    public int minimumOneBitOperations(int n) {
        if (n == 0) return 0;
        int k = 31 - Integer.numberOfLeadingZeros(n);
        return (1 << (k + 1)) - 1 - minimumOneBitOperations(n ^ (1 << k));
    }
}