class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> t_hash = new HashMap<>();

        for(char ch : t.toCharArray()) {
            t_hash.put(ch, t_hash.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> curr = new HashMap<>();

        String min_win = "";
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            char ele = s.charAt(r);
            curr.put(ele,curr.getOrDefault(ele,0)+1);
            while(isValid(t_hash,curr))
            {
                String ans = s.substring(l,r+1);
                if(ans.length()<min_win.length() || min_win=="")
                {
                    min_win = ans;
                }
                char rem = s.charAt(l);
                curr.put(rem,curr.get(rem)-1);
                if(curr.get(rem)==0)
                {
                    curr.remove(rem);
                }
                l+=1;
            }
        }
        return min_win;
    }
    public static boolean isValid(HashMap<Character, Integer> t_hash,HashMap<Character, Integer> curr)
    {
        for(char key:t_hash.keySet())
        {
            
                if(!curr.containsKey(key))
                {
                    return false;
                }
                if(curr.get(key)<t_hash.get(key))
                {
                    return false;
                }
        }
        return true;
    }
}