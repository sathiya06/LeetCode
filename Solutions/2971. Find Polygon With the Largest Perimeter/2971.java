class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long total = 0;
        long ans = -1;
        for(int i: nums){
            if (total > i){
                ans = total + i;
            }
            total += i;
        }
        return ans;
    }
}