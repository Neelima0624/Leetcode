class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] arr = new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            arr[ch-'a'] = true;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==false )
            {
              return false;
            }
        }
        return true;
    }
}