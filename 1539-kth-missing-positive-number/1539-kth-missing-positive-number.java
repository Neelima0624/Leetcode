class Solution {
    public int findKthPositive(int[] arr, int k) {

        boolean[] p = new boolean[2001];

        for(int num : arr) {
            p[num] = true;
        }

        int count = 0;

        for(int i = 1; i < p.length; i++) {

            if(!p[i]) {
                count++;

                if(count == k) {
                    return i;
                }
            }
        }

        return -1;
    }
}