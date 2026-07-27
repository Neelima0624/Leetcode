class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i:asteroids)
        {
            boolean destroyed = false;
            while(!st.isEmpty() && st.peek() > 0 && i<0)
            {
                if(Math.abs(i)>st.peek())
                {
                   st.pop();
                }
                else if(Math.abs(i)<st.peek())
                {
                    destroyed = true;
                    break;
                }
                else if(Math.abs(i)==st.peek())
                {
                    st.pop();
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed)
            {
               st.push(i);
            }

        }
        int[] arr = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--)
        {
            arr[i] = st.pop();
        }
         return arr;
    }
}