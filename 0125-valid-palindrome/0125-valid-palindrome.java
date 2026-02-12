class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String c="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
             c=c+ch;
            }
        }
        int left=0;
        int right=c.length()-1;
        while(left<right)
        {
            if(c.charAt(left)!=c.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}