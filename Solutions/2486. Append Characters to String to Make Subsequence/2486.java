class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        int sLen = s.length(), tLen = t.length();
        char[] sc = s.toCharArray(), tc = t.toCharArray();
        while(i < sLen && j < tLen){
            if(sc[i] == tc[j]){
                j++;
            }
            i++;
        }
        return tLen - j;
    }
}