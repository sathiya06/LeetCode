class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> ansFre = getFre(words[0]);
        for(int i = 1; i < words.length; i++){
            HashMap<Character, Integer> curFre = getFre(words[i]);
            char c = 'a';
            for(Map.Entry<Character, Integer> entrySet : ansFre.entrySet()){
                c = entrySet.getKey();
                if(curFre.containsKey(c)){
                    entrySet.setValue(Math.min(entrySet.getValue(), curFre.get(c)));
                }else {
                    entrySet.setValue(0);
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for(Map.Entry<Character, Integer> entrySet : ansFre.entrySet()){
            for(int i = 0; i < entrySet.getValue(); i++){
                ans.add(entrySet.getKey()+"");
            }
        }
        return ans;
    }
    public HashMap<Character, Integer> getFre(String word){
        char[] arr = word.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c: arr){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        return hm;
    }
}