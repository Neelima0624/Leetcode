class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int m = sandwiches.length;
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++)
        {
            queue.offer(students[i]);
        }
        for(int i=m-1;i>=0;i--)
        {
            st.push(sandwiches[i]);
        }
        int count = 0;
        while(!queue.isEmpty() && count<=queue.size()){
        if(queue.peek().equals(st.peek()))
        {
            queue.poll();
            st.pop();
            count=0;
        }
        else{
            queue.offer(queue.poll());
            count+=1;
        }
        }
        return queue.size();

    }
}