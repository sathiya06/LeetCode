class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length, m = grid[0].length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    makeZero(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void makeZero(char[][] grid, int i, int j){
        int n=grid.length, m = grid[0].length;
        if(i<0 || j<0 || i==n || j==m){
            return;
        }
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
            makeZero(grid, i-1, j);
            makeZero(grid, i+1, j);
            makeZero(grid, i, j-1);
            makeZero(grid, i, j+1);
        }
    }
}