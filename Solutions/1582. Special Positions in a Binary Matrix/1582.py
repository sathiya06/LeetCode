class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        m = len(mat)
        n = len(mat[0])
        row_sum = [0] * m
        column_sum = [0] * n
        for i in range(m):
            for j in range(n):
                if mat [i][j] == 1:
                    row_sum[i] += mat[i][j]
                    column_sum[j] += mat[i][j]
        ans = 0
        for i in range(m):
            for j in range(n):
                if mat[i][j] == 1 and row_sum[i] == 1 and column_sum[j] == 1:
                    ans += 1
        return ans