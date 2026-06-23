class Solution {
    public int search(int[] arr, int target) {
        int pivot=findPivot(arr);
        if(pivot==-1){
            return bs(arr,0,arr.length-1,target);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        System.out.println(pivot);
        int left=-1;
        int right=-1;
        if(arr[0]<=target){
            left=bs(arr,0,pivot,target);

        }
        right=bs(arr,pivot+1,arr.length-1,target);
        if(left==-1 && right==-1){
            return -1;
        }
        if(left!=-1){
            return left;
        }
        return right;
    }
    public int bs(int arr[],int s,int e,int target){
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
        
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