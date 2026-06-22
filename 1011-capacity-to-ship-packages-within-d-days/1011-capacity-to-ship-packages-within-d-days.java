class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min_cap = 0;
        int max_cap = 0;
        for(int weight:weights)
        {
            if(weight>min_cap){
           min_cap = weight;
            }
        max_cap +=weight;
        }
        int ans=0;
        while(min_cap<=max_cap)
        {
            int mid = (min_cap+max_cap)/2;
            if(canShip(weights,days,mid))
            {
               ans = mid;
               max_cap = mid-1;
            }
            else{
                min_cap=mid+1;
            }
        }
        return ans;
    }
    public boolean canShip(int weights[],int days,int cap)
    {
      int curr_wt=0;
      int d=1;
      for(int wt:weights){
        if(curr_wt+wt<=cap)
        {
            curr_wt+=wt;
        }
        else{
            d+=1;
            curr_wt=wt;
        }
      }
      if(d<=days)
      {
        return true;
      }
      return false;
    }
     
    }