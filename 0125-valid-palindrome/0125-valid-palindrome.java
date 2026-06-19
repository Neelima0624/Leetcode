class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            while( l<r && !Character.isLetterOrDigit(s.charAt(l)))
            {
                l++;
            }
            while(r>l && !Character.isLetterOrDigit(s.charAt(r)))
            {
                r--;
            }
            char l_c = s.charAt(l);
            char r_c = s.charAt(r);
        if(Character.isUpperCase(s.charAt(l)))
        {
             l_c = Character.toLowerCase(s.charAt(l));
        }
        if(Character.isUpperCase(s.charAt(r)))
        {
             r_c = Character.toLowerCase(s.charAt(r));
        }
        if(l_c != r_c)
        {
            return false;
        }
        l++;
        r--;
        }
        return true;
    }
}