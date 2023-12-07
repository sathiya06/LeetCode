class Solution {
    public String largestOddNumber(String num) {
      int ans=0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i) % 2 == 1){
              ans = i+1;
              break;
            }
        }
      return num.substring(0,ans);
    }
}