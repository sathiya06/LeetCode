class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i) + 1);
            }else {
                hm.put(i,1);
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        for(Map.Entry<Integer,Integer> map: hm.entrySet()){
            if(hs.contains(map.getValue())){
                return false;
            }
            hs.add(map.getValue());
        }
        return true;
    }
}