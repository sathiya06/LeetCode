class Solution:
    map = {}
    def climbStairs(self, n: int) -> int:
        if n == 1: return 1
        if n == 2: return 2
        if n in self.map:
            return self.map[n]
        ans = self.climbStairs(n-1) + self.climbStairs(n-2)
        self.map[n] = ans
        return ans
        