class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        HashMap<Integer,Integer> need = new HashMap<>();
        for(int i:nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int num:nums)
        {
            if(freq.getOrDefault(num,0)<=0){
                continue;
            }
            int need_val = need.getOrDefault(num,0);
            if(need_val>0)
            {
                need.put(num,need_val-1);
                need.put(num+1,need.getOrDefault(num+1,0)+1);
            }
            else{
                if(freq.getOrDefault(num+1,0)<=0 || freq.getOrDefault(num+2,0)<=0)
                {
                    return false;
                }
                freq.put(num+1,freq.getOrDefault(num+1,0)-1);
                freq.put(num+2,freq.getOrDefault(num+2,0)-1);
                need.put(num+3,need.getOrDefault(num+3,0)+1);
            }
            freq.put(num,freq.getOrDefault(num,0)-1);
        }
        return true;
    }
}