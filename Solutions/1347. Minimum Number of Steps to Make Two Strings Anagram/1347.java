class Solution {
    public int minSteps(String s, String t) {
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        for(int i=0;i<s.length();i++){
            fre1[s.charAt(i) - 'a']++;
            fre2[t.charAt(i) - 'a']++;
        }
        int ans = 0;
        for(int i=0;i<26;i++){
            int temp = fre1[i] - fre2[i];
            if(temp > 0){
                ans += temp;
            }
        }
        return ans;
    }
}