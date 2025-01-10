class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0; 
        long right = (long)Math.sqrt(c) + 1;
        long total = 0;
        while(left <= right){
            total = (left * left) + (right * right);
            if(total == c){
                return true;
            }
            if(total < c){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}
