class Solution {
    public int maxScore(String s) {
        int left=0, right =0;
        left = s.charAt(0) == '0' ? 1 : 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == '1'){
                right++;
            }
        }
        int max = left + right;
        for(int i=1;i<s.length() - 1;i++){
            if(s.charAt(i) == '0'){
                left++;
            } else{
                right--;
            }
            max = Math.max(max, left+right);
        }
        return max;
    }
}