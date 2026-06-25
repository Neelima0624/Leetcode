class Solution {
    public int minDays(int[] nums, int m, int k) {
        int min = 1;
        int max = nums[0];
        for(int ele:nums)
        {
            if(ele>max)
            {
                max = ele;
            }
        }
        int ans = -1;
        while(min<=max)
        {
            int mid = (min+max)/2;
            if(canMake(nums,m,k,mid))
            {
               ans = mid;
               max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return ans;
    }
        public boolean  canMake(int[] nums,int m,int k,int days)
        {
            int flowers = 0;
            int b = 0;
            for(int i=0;i<nums.length;i++)
            {
                 if(nums[i]<=days)
                 {
                    flowers = flowers+1;
                 }
                 else{
                    flowers = 0;
                 }
                 if(flowers==k)
                 {
                    b = b+1;
                    flowers = 0;
                 }
            }
            return b>=m;  
        }  
}