class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        
        //populating the hashes
        for(char c:s.toCharArray())
        {
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray())
        {
            h2.put(c,h2.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:h1.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();
            if(!h2.containsKey(key))
            {
                return false;
            }
            if(val!=h2.get(key))
            {
                return false;
            }
        }
        return true;
    }
}