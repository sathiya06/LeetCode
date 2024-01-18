class Solution {
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    public int climbStairs(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        if(hm.containsKey(n))return hm.get(n);
        int ans= climbStairs(n-1)+climbStairs(n-2);
        hm.put(n,ans);
        return ans;
    }
}