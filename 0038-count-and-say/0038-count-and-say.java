class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i=2;i<=n;i++)
        {
           StringBuilder ans = new StringBuilder();
           int j=0;
           while(j<s.length())
           {
            int c=1;
            while((j+1<s.length()) && s.charAt(j)==s.charAt(j+1))
            {
                c=c+1;
                j=j+1;
            }
            ans.append(c);
            ans.append(s.charAt(j));
           j++;
        }
        s=ans.toString();
        }
        return s; 
    }
}