class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        n = len(grid)
        m = len(grid[0])
        ans = 0
        def makeZero( i: int, j: int):
            if i<0 or j<0 or i==n or j==m:
                return 
            if grid[i][j] == '1':
                grid[i][j] = 0
                makeZero( i-1, j)
                makeZero( i, j-1)
                makeZero( i, j+1)
                makeZero( i+1, j)

        for i in range(n):
            for j in range(m):
                if grid[i][j] == '1':
                    makeZero( i, j)
                    ans += 1
        return ans