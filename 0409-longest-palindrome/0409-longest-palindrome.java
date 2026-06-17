class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        boolean odd = false;
        for(char key : map.keySet())
        {
           int freq = map.get(key);
           if(freq %2==0)
           {
            count = count+freq;
           }
           else{
            count = count+freq-1;
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