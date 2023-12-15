class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> hs = new HashSet<>();
        for(List<String> path : paths){
            hs.add(path.get(0));
        }
        for(List<String> path : paths){
            if (!hs.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}