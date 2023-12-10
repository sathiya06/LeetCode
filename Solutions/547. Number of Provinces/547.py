class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        visited = [0 for _ in range(n)]
        count = 0
        for i in range(n):
            if visited[i] == 0:
                visited[i] = 1
                count += 1
                self.dfs(isConnected, visited, i)
        return count

    def dfs(self,  isConnected: List[List[int]],  visited: List[int], i: int) -> None:
        m = len(isConnected[0])
        for j in range(m):
            if visited[j] == 0 and isConnected[i][j] == 1:
                visited[j] = 1
                self.dfs(isConnected, visited, j)