class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ec) {
        int max=Arrays.stream(candies).max().getAsInt();
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+ec>=max)
            list.add(true);
            else
            list.add(false);
        }
        return list;
    }
}