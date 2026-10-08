import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        result.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {

            start = 0;

            // If current number is duplicate,
            // use only subsets created in previous round
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }

            end = result.size() - 1;

            for (int j = start; j <= end; j++) {

                List<Integer> L =
                    new ArrayList<>(result.get(j));

                L.add(nums[i]);

                result.add(L);
            }
        }

        return result;
    }
}