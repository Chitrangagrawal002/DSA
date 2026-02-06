class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        int pi = 0, bi = 0, cap = 0;
        Arrays.sort(buses);
        Arrays.sort(passengers);
        while(bi < buses.length){
            cap = 0;
            while(cap < capacity && pi < passengers.length && passengers[pi] <= buses[bi]){
                cap++;
                pi++;
            }
            bi++;
        }
        pi--;
        if(cap < capacity && (pi < 0 || buses[buses.length - 1] != passengers[pi])){
            return buses[buses.length - 1];
        }
        while(pi > 0 && (passengers[pi] - 1 == passengers[pi - 1])){
            pi--;
        }
        return passengers[pi] - 1;
    }
}