class Solution {
    public String countAndSay(int n) {
   return Solve(1,n,"1");
    }
       public static String rle(String s){
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
        return ans.toString();
    }
    public static String Solve(int c,int n,String s)
    {
       if(c==n)
       {
        return s;
       }
       return Solve(c+1,n,rle(s));
    }
}