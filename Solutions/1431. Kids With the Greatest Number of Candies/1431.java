class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxIndex = 0;
        for(int i=1;i<candies.length;i++){
            if(candies[maxIndex] < candies[i]){
                maxIndex = i;
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= candies[maxIndex]){
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;
    }
}