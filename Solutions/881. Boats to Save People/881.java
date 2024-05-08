class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0, end = people.length - 1, ans = 0;
        while(start <= end){
            if(people[start] + people[end] <= limit){
                start++;
                end--;
                ans++;
            } else{
                if(people[end] <= limit){
                    end--;
                    ans++;
                }
                else if(people[start] <= limit){
                    start++;
                    ans++;
                }
            }
        }
        return ans;
    }
}