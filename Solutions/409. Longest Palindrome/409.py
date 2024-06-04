class Solution:
    def longestPalindrome(self, s: str) -> int:
        hm = {}
        ans = 0
        is_odd = 0
        for c in s:
            hm[c] = hm.get(c, 0) + 1
        for fre in hm.values():
            if fre % 2 == 0:
                ans += fre
            else:
                is_odd = 1
                ans += fre - 1
        return ans + is_odd