class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        ArrayList<Integer> list  = new ArrayList<>();
       Deque<Integer> dq = new ArrayDeque<>();
       for(int i=0;i<k;i++)
       {
        while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()])
        {
            dq.pollLast();
        }
        dq.offerLast(i);
       }
       list.add(arr[dq.peekFirst()]);
       for(int j=k;j<arr.length;j++)
       {
        if(j-k==dq.peekFirst())
        {
            dq.pollFirst();
        }
        while(!dq.isEmpty() && arr[j]>arr[dq.peekLast()])
        {
            dq.pollLast();
        }
        dq.offerLast(j);
        list.add(arr[dq.peekFirst()]);
       }
       int res[] = new int[list.size()];
       for(int i=0;i<list.size();i++)
       {
        res[i] = list.get(i);
       }
       return res;
        
    }
}