class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int rem = 0;
        for(int i : nums){
            sum += i;
            rem = (sum + k) % k;
            if(hm.containsKey(rem)){
                ans += hm.get(rem);
            }
            hm.put(rem, hm.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}