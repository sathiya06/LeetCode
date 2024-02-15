class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posInd = getNextPos(nums, 0);
        int negInd = getNextNeg(nums, 0);
        int[] ans = new int[nums.length];
        int ansInd = 0;
        while(posInd != -1 && negInd != -1){
            ans[ansInd] = nums[posInd];
            ansInd++;
            posInd = getNextPos(nums, posInd+1);
            ans[ansInd] = nums[negInd];
            ansInd++;
            negInd = getNextNeg(nums, negInd+1);
        }
        return ans;
    }
    public int getNextPos(int[] nums, int ind){
        for(int i=ind;i<nums.length;i++){
            if (nums[i] > 0){
                return i;
            }
        }
        return -1;
    }
    public int getNextNeg(int[] nums, int ind){
        for(int i=ind;i<nums.length;i++){
            if (nums[i] < 0){
                return i;
            }
        }
        return -1;
    }
}