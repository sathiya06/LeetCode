class Solution:
    def transpose(self, m: List[List[int]]) -> List[List[int]]:
        ans = [[None]*len(m) for _ in range(len(m[0]))]
        for i in range(len(m)):
            for j in range(len(m[0])):
                ans[j][i] = m[i][j]
        return ans 