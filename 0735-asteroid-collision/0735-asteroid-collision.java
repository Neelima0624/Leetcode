class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i:asteroids)
        {
            if(i>0)
            {
                st.push(i);
            }
            else
            {
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-i){
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(i);
                }
                 else if (st.peek() == -i) {
                    st.pop();
                }
            }
        }
        int[] arr = new int[st.size()];
        for(int j=arr.length-1;j>=0;j--)
        {
           arr[j] = st.pop();
        }
        return arr;

    }
}