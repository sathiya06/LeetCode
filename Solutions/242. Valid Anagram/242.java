class Solution {
    public boolean isAnagram(String s, String t) {
        int[] set = new int[26];
        int m = s.length(), n = t.length();
        if(m!=n){
            return false;
        }
        for(int i=0;i<m;i++){
            set[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<n;i++){
            set[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++){
            if(set[i] != 0){
                return false;
            }
        }
        return true;
    }
}