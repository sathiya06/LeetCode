class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> fre = new HashMap<>();
        for(int a : arr){
            fre.put(a, 1 + fre.getOrDefault(a,0));
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(fre.values());
        while (k > 0)
            k -= pq.poll();
        return k < 0 ? pq.size() + 1 : pq.size(); 
    }
}