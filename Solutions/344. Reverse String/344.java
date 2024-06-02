class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        char temp = 'a';
        while(start < end){
            temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }
}