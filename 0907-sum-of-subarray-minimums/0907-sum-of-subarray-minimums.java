/*class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
           int min = arr[i];
           for(int j=i;j<n;j++)
           {
            min = Math.min(min,arr[j]);
            sum = sum+arr[j];
            }
        }
        return sum;
    }
}
*/
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;

        int[] nse = next(arr);
        int[] pse = prev(arr);

        long mod = 1000000007;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            sum = (sum + (left * right * arr[i]) % mod) % mod;
        }

        return (int) sum;
    }

    public int[] prev(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }

    public int[] next(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, n);

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }
}