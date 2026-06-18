class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        String st1 = new String(ch);
        for(int i=0;i<=s2.length()-k;i++)
        {
          String st = s2.substring(i,i+k);
          char[] ch2 = st.toCharArray();
          Arrays.sort(ch2);
          String  st2 = new String(ch2);
          if(st2.equals(st1))
          {
            return true;
          }
        }
        return false;

    }
}