class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int k = p.length();
        char[] parr = p.toCharArray();
        Arrays.sort(parr);
        String sort  = new String(parr);
        for(int i=0;i<=s.length()-k;i++)
        {
            String sub = s.substring(i,i+k);
            char[] arr = sub.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(sorted.equals(sort))
            {
                list.add(i);
            }

        }
        return  list;
        
    }
}