class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        long sum = 0, sqSum = 0;
        for (int x : nums) {
            sum += x;
            sqSum += (long)x * x;
        }
        long expSum = (long)n * (n + 1) / 2;
        long expSqSum = (long)n * (n + 1) * (2L * n + 1) / 6;
        long S = sum - expSum;
        long SQ = sqSum - expSqSum;
        long dup = (S + SQ / S) / 2;
        long miss = dup - S;
        return new int[]{(int)dup, (int)miss};
    }
}
