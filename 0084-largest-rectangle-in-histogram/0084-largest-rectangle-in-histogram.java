class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] pse = new int[n];
        int[] nse = new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st1.isEmpty() && heights[i]<=heights[st1.peek()])
            {
                st1.pop();
            }
            if(st1.isEmpty())
            {
                pse[i] = -1;
            }
            else{
                pse[i] = st1.peek();
            }
            st1.push(i);
        }
        for(int i=n-1;i>=0;i--)
        {
            while(!st2.isEmpty() && heights[i]<=heights[st2.peek()])
            {
                st2.pop();
            }
            if(st2.isEmpty())
            {
                nse[i] = n;
            }
            else{
                nse[i] = st2.peek();
            }
            st2.push(i);
        }
        int maxarea = 0;
        for(int i=0;i<n;i++)
        {
            int width = nse[i]-pse[i]-1;
            int area = heights[i]*width;
            maxarea = Math.max(maxarea,area);
        }
        return maxarea;
    }
}