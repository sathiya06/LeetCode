class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int sum = 0;
        int rem = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            rem = sum % k;
            if(!hm.containsKey(rem)){
                hm.put(rem, i);
            }else if(i - hm.get(rem) > 1){
                return true;
            }
        }
        return false;
    }
}