class Solution {
    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        TreeSet<int[]> kminimum = new TreeSet<>((a,b) -> a[0] == b[0] ? Integer.compare(a[1] , b[1]) : Integer.compare(a[0] , b[0]));
        TreeSet<int[]> remain = new TreeSet<>((a,b) -> a[0] == b[0] ? Integer.compare(a[1] , b[1]) : Integer.compare(a[0] , b[0]));
        long sum = 0;
        int i = 1;
        while(i - dist < 1 && i < n){
            int curr[] = new int[]{nums[i], i};
            kminimum.add(curr);
            sum += nums[i];
            if(kminimum.size() > k - 1){
                int largest[] = kminimum.pollLast();
                sum -= largest[0];
                remain.add(largest);
            }
            i++;
        }
        long result = Long.MAX_VALUE;
        while(i < n){
            int curr[] = new int[]{nums[i], i};
            kminimum.add(curr);
            sum += nums[i];
            if(kminimum.size() > k - 1){
                int largest[] = kminimum.pollLast();
                sum -= largest[0];
                remain.add(largest);
            }
            result = Math.min(result, sum);
            int removeidx = i - dist;
            int toremove[] = new int[]{nums[removeidx], removeidx};
            if(kminimum.remove(toremove)){
                sum -= nums[removeidx];
                if(!remain.isEmpty()){
                    int promote[] = remain.pollFirst();
                    kminimum.add(promote);
                    sum += promote[0];
                }
            }
            else{
                remain.remove(toremove);
            }
            i++;
        }
        return nums[0] + result;
    }
}