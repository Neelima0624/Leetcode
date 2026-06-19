class Solution {
    public String longestPalindrome(String s) {
       String ans = "";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                 String sub = s.substring(i,j+1);
                 if( isPal(sub) && sub.length()>ans.length())
                 {
                    ans = sub;
                 }

            }
        }
        return ans;
    }
        public static boolean isPal(String sub)
        {
            int l = 0;
            int r = sub.length()-1;
            while(l<=r)
            {
                if(sub.charAt(l)!=sub.charAt(r))
                {
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
}