class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        HashSet<Integer> hs1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);
        }

        HashSet<Integer> hs2 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            hs2.add(nums2[i]);
        }

        for(int i : hs1){
            if(!hs2.contains(i)) 
                ans.get(0).add(i);
        }

        for(int i : hs2){
            if(!hs1.contains(i)) 
                ans.get(1).add(i);
        }

        return ans;
    }
}