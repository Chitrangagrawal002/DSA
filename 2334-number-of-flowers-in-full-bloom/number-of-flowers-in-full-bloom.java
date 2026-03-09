class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int m = flowers.length;
        int n = people.length;
        int ans[] = new int[n];

        int start[] = new int[m];
        int end[] = new int[m];
        for(int i = 0; i < m; i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        
        for(int i = 0; i < n; i++){
            int bloomed = upperbound(start, people[i]);
            int died = lowerbound(end, people[i]);
            ans[i] = bloomed - died;
        }
        return ans; 
    }
    public int upperbound(int[] start, int target){
        int lo = 0;
        int hi = start.length - 1;
        int res = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(start[mid] > target){
                res = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return res == -1 ? start.length : res;
    }
    public int lowerbound(int[] end, int target){
        int lo = 0;
        int hi = end.length - 1;
        int res = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(end[mid] < target){
                lo = mid + 1;
            }
            else{
                res = mid;
                hi = mid - 1;
            }
        }
        return res == -1 ? end.length : res;
    }
}