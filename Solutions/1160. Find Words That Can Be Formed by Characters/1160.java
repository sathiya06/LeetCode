class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> fre1 = new HashMap<>();
        for (char c: chars.toCharArray()){
            fre1.put(c, fre1.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
        for (String word: words){
            HashMap<Character, Integer> fre2 = new HashMap<>();
            for (char c: word.toCharArray()){
                fre2.put(c, fre2.getOrDefault(c, 0) + 1);
            }
            boolean check = true;
            for(Map.Entry<Character, Integer> set : fre2.entrySet()){
                if (fre1.containsKey(set.getKey())){
                    if (fre1.get(set.getKey()) < set.getValue()){
                        check = false;
                    }
                }else{
                    check = false;
                }
            }
            if (check){
                ans += word.length();
            }
        }
        return ans;
    }
}