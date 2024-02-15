class Solution {
    public String firstPalindrome(String[] words) {
        for (String word: words) {
            if (checkPalindrome(word)){
                return word;
            }
        }
        return "";
    }
    public boolean checkPalindrome(String word) {
        char[] text = word.toCharArray();
        int start = 0, end = word.length() - 1;
        while(start < end){
            if (text[start] != text[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}