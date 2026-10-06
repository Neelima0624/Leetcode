class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ml = new ArrayList<>();

        fun(nums, 0, new ArrayList<>(), ml);

        return ml;
    }

    public void fun(int[] nums, int index, List<Integer> li, List<List<Integer>> ml) {
        ml.add(new ArrayList<>(li));
        for (int i = index; i < nums.length; i++) {
            li.add(nums[i]);
            fun(nums, i + 1, li, ml);
            li.remove(li.size() - 1);
        }
    }
}