class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max = 0, curMax = 0;
        int start = 0;
        HashMap<Integer,Integer> freMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!freMap.containsKey(nums[i])){
                freMap.put(nums[i], 1);
            }else if(freMap.get(nums[i]) < k){
                freMap.put(nums[i], freMap.get(nums[i]) + 1);
            } else{
                while(nums[start] != nums[i]){
                    freMap.put(nums[start], freMap.get(nums[start]) - 1);
                    start++;
                }
                start += 1;
            }
            curMax = i - start + 1;
            max = Math.max(curMax, max);
        }
        return max;
    }
}