class Solution {
    public int findMin(int[] arr) {

    int pivot = findPivot(arr);

    if(pivot == -1){
        return arr[0];
    }

    return arr[pivot + 1];
}
       public int findPivot(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[s]<arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    
}