class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];
        int count = 0;
        for (int i=0;i<n;i++){
            if(visited[i] != 1){
                visited[i] = 1;
                count++;
                dfs(isConnected, visited, i);
            }
        }
        return count;
    }
    public void dfs(int[][] isConnected, int[] visited, int i){
        int m = isConnected[0].length;
        for(int j=0;j<m;j++){
            if(visited[j] != 1 && isConnected[i][j] == 1){
                visited[j] = 1;
                dfs(isConnected, visited, j);
            }
        }
    }
}