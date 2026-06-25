class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 1;
        int e = arr.length-2;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                return mid;
            }
            else if( arr[mid-1]<arr[mid]){
                s= mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return -1;
    }
}