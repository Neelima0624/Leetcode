class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)
        {
            return n;
        }
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
          for(int i=0;i<trust.length;i++)
          {
            int key = trust[i][1];
            ArrayList<Integer> val = map.getOrDefault(key, new ArrayList<>());
            val.add(trust[i][0]);
            map.put(key,val);
          }
          int judge = -1;
          System.out.println(map);
          for(Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet())
          {
            if(entry.getValue().size()==n-1)
            {
                judge = entry.getKey();
            }
          }
          for(int i=0;i<trust.length;i++)
          {
             if(trust[i][0] == judge)
             {
                return -1;
             }
          }
          return judge;
    }
}