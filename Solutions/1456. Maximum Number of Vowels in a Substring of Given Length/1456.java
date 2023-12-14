class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0, cur = 0;
        for (int i = 0; i < s.length(); i++) {
            if ( isVowel( s.charAt(i) ) ) {
                cur++;
            }
            if ( i >= k && isVowel( s.charAt(i-k) ) ) {
                cur--;
            }
            ans = Math.max(cur, ans);
        }
        return ans;
    }
    private boolean isVowel(Character c){
        return c  == 'a' || c  == 'e' || c  == 'i' || c  == 'o' || c  == 'u';
    }
}