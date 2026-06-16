class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str:strs)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            List<String> val = map.getOrDefault(key,new ArrayList<>());
            val.add(str);
            map.put(key,val);
        }
        return new ArrayList<>(map.values());
    }
}