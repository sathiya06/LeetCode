class Solution:
    def minSteps(self, s: str, t: str) -> int:
        fre, ans = Counter(s), 0
        for c in t:
            if fre[c] > 0:
                fre[c] -= 1
            else:
                ans += 1
        return ans

        