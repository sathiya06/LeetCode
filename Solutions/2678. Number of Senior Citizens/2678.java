class Solution {
    public int countSeniors(String[] details) {
        int ans = 0, temp = 0;
        for(String entry : details){
            temp = Integer.parseInt(entry.substring(11,13));
            if(temp > 60){
                ans++;
            }
        }
        return ans;
    }
}
