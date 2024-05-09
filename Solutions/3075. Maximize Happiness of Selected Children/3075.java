class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        int n = happiness.length - 1;
        Arrays.sort(happiness);
        for(int i = 0; i < k; i++){
            ans += Math.max(0, happiness[n - i] - i);
        }
        return ans;
    }
}