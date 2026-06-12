class Solution {
    public boolean canJump(int[] nums) {
        int high = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>high){
                return false;
            }
            high = Math.max(high,i+nums[i]);
        }
        return true;
        
    }
}