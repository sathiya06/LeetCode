class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0;
        int oddAvailable = 0;
        char[] arr = s.toCharArray();
        for(int i=0; i < arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int fre = 0;
        for(Map.Entry<Character, Integer> entrySet : hm.entrySet()){
            fre = entrySet.getValue();
            if(fre % 2 == 0){
                ans += fre;
            }else{
                oddAvailable = 1;
                ans += fre - 1;
            }
        }
        return ans + oddAvailable;
    }
}