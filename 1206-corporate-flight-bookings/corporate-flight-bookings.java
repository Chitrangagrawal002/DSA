class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int res[] = new int[n];
        for(int[] book : bookings){
            int start = book[0];
            int end = book[1];
            int seats = book[2];
            res[start - 1] += seats;
            if(end < n) {
                res[end] -= seats;
            }
        }
        for(int i = 1; i < n; i++){
            res[i] += res[i - 1];
        }
        return res;
    }
}