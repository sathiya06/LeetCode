class Solution:
    def onesMinusZeros(self, mat: List[List[int]]) -> List[List[int]]:
        m = len(mat)
        n = len(mat[0])
        row_sum = [0] * m
        column_sum = [0] * n
        for i in range(m):
            for j in range(n):
                if mat [i][j] == 1:
                    row_sum[i] += 1
                    column_sum[j] += 1
        ans = [[0] * n for _ in range(m)]
        for i in range(m):
            for j in range(n):
                onesRow = row_sum[i]
                onesCol = column_sum[j]
                ans[i][j] = onesRow + onesCol + (onesRow - m) + (onesCol - n)
        return ans