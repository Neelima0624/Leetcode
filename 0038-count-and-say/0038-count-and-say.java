class Solution {
    public String countAndSay(int n) {
   if(n==1)
   {
    return "1";
   }
   String ans = countAndSay(n-1);
   return rle(ans);
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
}