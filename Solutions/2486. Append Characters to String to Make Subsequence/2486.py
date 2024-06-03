class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        i, j = 0, 0
        sLen, tLen = len(s), len(t)
        while i < sLen and j < tLen:
            if s[i] == t[j]:
                j += 1
            i += 1
        return tLen - j