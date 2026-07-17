class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int l = bookings[i][0]-1;
            int r = bookings[i][1]-1;
            int v = bookings[i][2];

            arr1[l] += v;

            if (r + 1 < n) {
                arr1[r + 1] -= v;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1[i];
            arr2[i] += sum;
        }

        return arr2;
    }
}