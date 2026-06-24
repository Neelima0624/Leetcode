class Solution {

    public boolean search(int[] nums, int target) {

        int pivot=findPivot(nums);
        System.out.println(pivot);
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        boolean left=binarySearch(nums,target,0,pivot);
        if(left){
            return true;
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    public int findPivot(int nums[]){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(mid<e && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>s && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[s]==nums[mid] && nums[mid]==nums[e]){
                if(s<e && nums[s]>nums[s+1]){
                    return s;
                }
                if(e>s && nums[e-1]>nums[e]){
                    return e-1;
                }
                s++;
                e--;
                
            }
            else if(nums[s]<nums[mid] || nums[s]==nums[mid] && nums[mid]>nums[e]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }

      
    private boolean binarySearch(int[] nums, int target, int s, int e) {

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return false;
    }
}