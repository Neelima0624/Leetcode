class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        boolean odd = false;
        for(Integer i : map.values())
        {
           if(i %2==0)
           {
            count = count+i;
           }
           else{
            count = count+i-1;
            odd = true;
           }
    }
    if(odd)
    {
        count++;
    }
    return count;
    }
}