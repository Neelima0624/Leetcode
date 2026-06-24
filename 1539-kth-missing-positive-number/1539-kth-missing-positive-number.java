class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n =  arr[arr.length-1]+k;
        boolean[] p = new boolean[n+1];
        for(int num:arr)
        {
            p[num] = true;
        }
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if (!p[i]) {
                count++;

                if (count == k) {
                    return i;
                }
            }
        }

        return -1;
    }
}