class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left  = 0;
        int sum = 0;
        int min_count = Integer.MAX_VALUE;
        for(int right = 0;right<nums.length;right++)
        {
            sum = sum + nums[right];
            while(sum>=target)
            {
                int size = right - left + 1;
                min_count = Math.min(min_count,size);
                sum = sum - nums[left];
                left++;
            }
        }
        
    return min_count == Integer.MAX_VALUE ? 0 : min_count;
}
           
}