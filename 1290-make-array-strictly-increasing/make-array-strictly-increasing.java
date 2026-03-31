class Solution {
    Map<Integer, Map<Integer, Integer>> map;
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        map = new HashMap<>();
        int res = solve(arr1, arr2, 0, Integer.MIN_VALUE);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    int solve(int[] arr1, int[] arr2, int idx, int prev){
        if(idx >= arr1.length){
            return 0;
        }
        if(map.containsKey(idx) && map.get(idx).containsKey(prev)){
            return map.get(idx).get(prev);
        }
        int res1 = Integer.MAX_VALUE;
        if(arr1[idx] > prev){
            res1 = solve(arr1, arr2, idx + 1, arr1[idx]);
        }
        int res2 = Integer.MAX_VALUE;
        int ceil = upperBound(arr2, prev);
        if (ceil < arr2.length) {
            int temp = solve(arr1, arr2, idx + 1, arr2[ceil]);
            if(temp != Integer.MAX_VALUE){
                res2 = 1 + temp;
            }
        }
        int ans = Math.min(res1, res2);
        map.computeIfAbsent(idx, k -> new HashMap<>()).put(prev, ans);
        return ans;
    }
    int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}