class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] split = sentence.split(" ");
        Collections.sort(dictionary, Comparator.comparingInt(String::length));
        for(int i=0; i< split.length; i++){
            for(String root: dictionary) {
                if(split[i].startsWith(root)){
                    split[i] = root;
                }
            }
        }
        return String.join(" ", split);
    }
}