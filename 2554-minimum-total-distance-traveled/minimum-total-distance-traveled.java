class Solution {
    Long dp[][];
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, Comparator.comparingInt(a -> a[0]));
        List<Integer> positions = new ArrayList<>();
        for(int[] f : factory){
            int pos = f[0];
            int limit = f[1];
            for(int i = 0; i < limit; i++){
                positions.add(pos);
            }
        }
        dp = new Long[robot.size() + 1][positions.size() + 1];
        return solve(robot, positions, 0, 0);
    }
    public long solve(List<Integer> robot, List<Integer> positions, int i, int j){
        if(i >= robot.size()){
            return 0;
        }
        if(j >= positions.size()){
            return (long) 1e12;
        }
        if(dp[i][j] != null) return dp[i][j];
        long take = Math.abs(robot.get(i) - positions.get(j)) + solve(robot, positions, i + 1, j + 1);
        long skip = solve(robot, positions, i, j + 1);
        return dp[i][j] = Math.min(take, skip);
    }
}