class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++)
        {
             sum = sum+nums[i];
        }
        double m = sum;
        for(int j=k;j<nums.length;j++)
        {
            sum = sum+nums[j]-nums[j-k];
            m = Math.max(m,sum);
        }
        return m/k;

        
    }
}