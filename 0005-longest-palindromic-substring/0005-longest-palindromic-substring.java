class Solution {
    public String longestPalindrome(String s) {
            int st = 0;
            int max_len=0;
            for(int i=0;i<s.length();i++)
            {
                int one = expand(s,i,i);
                int two = expand(s,i,i+1);
                int m = Math.max(one,two);
                if(m>max_len)
                {
                    st = i-((m-1)/2);
                    max_len = m;
                }

            }
            return s.substring(st,st+max_len);
    }
        public int expand(String s ,int l, int r)
        {
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                r++;
                l--;
            }
            return r-l-1;
        }
       
}