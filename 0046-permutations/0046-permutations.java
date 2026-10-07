class Solution {
    List<Integer> slist = new ArrayList<>();
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(slist.size()==nums.length)
        {
            list.add(new ArrayList<>(slist));
            return list;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(slist.contains(nums[i]))
            continue;
            slist.add(nums[i]);
            permute(nums);
            slist.remove(slist.size()-1);
        }
        return list;
    }
}